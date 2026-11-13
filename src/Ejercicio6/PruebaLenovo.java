
package Ejercicio6;

import java.util.Scanner;


public class PruebaLenovo {
    public static void main(String[] args) {
        ComisionesLenovo vendedor1 = new ComisionesLenovo();
        ComisionesLenovo vendedor2 = new ComisionesLenovo();
        
        Scanner sc = new Scanner(System.in);
        int opcArticulo;
        do{
            System.out.println("");
            System.out.println("VENTAS ONLINE DE NOTEBOOKS LENOVO");
            System.out.println("[1] - $7239.99");
            System.out.println("[2] - $9129.75");
            System.out.println("[3] - $6899.95");
            System.out.println("[4] - $13150.89");
            System.out.println("Presione 0 para salir");
            System.out.println("Ingrese que tipo de articulo vendio esta semana [1-4]: ");
            opcArticulo = sc.nextInt();
            if (opcArticulo >= 1 && opcArticulo <= 4){
                System.out.println("Ingrese cuantos vendio: ");
                vendedor1.setCantidad(sc.nextInt());
                vendedor1.setArticulo(opcArticulo);
                vendedor1.calcularVentas();
            }
        }while (opcArticulo!=0);
        vendedor1.calcularIngresos();
        System.out.println("");
        System.out.println("VENDEDOR 1:");
        System.out.println("Ventas brutas: " + vendedor1.getVentas());
        System.out.println("Ingresos totales: "  + vendedor1.getTotal());
        System.out.println("");
        
        vendedor2.setVentas(50000.0);
        vendedor2.calcularIngresos();
        System.out.println("VENDEDOR 2:");
        System.out.println("Ventas brutas: " + vendedor2.getVentas());
        System.out.println("Ingresos totales: "  + vendedor2.getTotal());
        
    }
}

