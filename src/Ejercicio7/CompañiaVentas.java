
package Ejercicio7;

import java.util.Scanner;

public class CompañiaVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[][] ventas = new double[5][4];
        double[] totalVendedor = new double[4];
        int cantVendedor = 4;
        int producto, cantNotas;
        double valor, totalProducto;
        
        for (int i = 0; i < cantVendedor; i++) {
            System.out.println("VENDEDOR " + (i+1) + ":");
            System.out.println("");
            do{
                System.out.println("Ingrese cuantas NOTAS desea guardar (0-5): ");
                cantNotas = sc.nextInt();
            }while (cantNotas<0 || cantNotas>5);
            
            for (int j = 0; j < cantNotas; j++) {
                do{
                    System.out.print("Numero de producto (1-5): ");
                    producto = sc.nextInt();
                }while (producto<1 || producto>5);
               
                System.out.println("Ingrese el valor total vendido: ");
                valor = sc.nextDouble();
                ventas[producto - 1][i] += valor;
            }
        }
        
        
        System.out.println("\n\t\tVENTAS POR VENDEDOR");
        System.out.println("Productos\tV1\tV2\tV3\tV4\tTotal");
        
        for (int i = 0; i < 5; i++) {
            totalProducto = 0;
            System.out.print("Producto " + (i + 1) + "\t");
            
            for (int j = 0; j < 4; j++) {
                System.out.print(ventas[i][j] + "\t");
                totalProducto += ventas[i][j];
                totalVendedor[j] += ventas[i][j];
            }
            System.out.println(totalProducto);
            
        }
        
        System.out.print("Total\t\t");
        double totalGeneral = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print(totalVendedor[i] + "\t");
            totalGeneral += totalVendedor[i];
        }
        System.out.println(totalGeneral);
    }
}