
package Ejercicio6;

import java.util.Scanner;


public class PruebaLenovo {
    public static void main(String[] args) {
        ComisionesLenovo vendedor1 = new ComisionesLenovo();
        ComisionesLenovo vendedor2 = new ComisionesLenovo();
        
        Scanner sc = new Scanner(System.in);
        int opcArticulo;
        do{
            System.out.println("VENTAS ONLINE DE NOTEBOOKS LENOVO");
            System.out.println("");
            System.out.println("[1] - $7239.99");
            System.out.println("[2] - $9129.75");
            System.out.println("[3] - $6899.95");
            System.out.println("[4] - $13150.89");
            System.out.println("Ingrese que tipo de articulo vendio esta semana [1-4]: ");
            opcArticulo = sc.nextInt();
        }while (opcArticulo<1 || opcArticulo>4);
            
        vendedor1.setArticulo(opcArticulo);
        System.out.println("");
        System.out.println("Ingrese cuantos vendio: ");
        vendedor1.setCantidad(sc.nextInt());
        vendedor1.calcularVentas();
        vendedor1.calcularIngresos();
        System.out.println("TOTAL VENDIDO: " + vendedor1.getVentas());
        System.out.println("USTED RECIBE: "  + vendedor1.getTotal());
        System.out.println("");
        
        vendedor2.setVentas(50000.0);
        vendedor2.calcularIngresos();
        System.out.println("VENDEDOR 2: " + vendedor2.getTotal() );
        
    }
}

