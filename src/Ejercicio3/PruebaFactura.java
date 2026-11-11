
package Ejercicio3;

public class PruebaFactura {
    public static void main(String[] args) {
        Factura f1 = new Factura(1, 10, "Chocolate", 5, 500);
        Factura f2 = new Factura(2, 15, "Caramelos", 15, -1000);
        
        System.out.println("FACTURA N." + f1.getNumeroFactura());
        System.out.println("");
        System.out.println("Descripcion: " + f1.getDescripcion());
        System.out.println("Cantidad: " + f1.getCantidad());
        System.out.println("Precio: " + f1.getPrecio());
        System.out.println("Monto final: " + f1.obtenerMontoFactura());
        System.out.println("");
        System.out.println("FACTURA N." + f2.getNumeroFactura());
        System.out.println("");
        System.out.println("Descripcion: " + f2.getDescripcion());
        System.out.println("Cantidad: " + f2.getCantidad());
        System.out.println("Precio: " + f2.getPrecio());
        System.out.println("Monto final: " + f2.obtenerMontoFactura());
        
    }
}
