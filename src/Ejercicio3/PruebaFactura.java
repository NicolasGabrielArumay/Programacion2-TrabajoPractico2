
package Ejercicio3;

public class PruebaFactura {
    public static void main(String[] args) {
        Factura f = new Factura(275, 10, "Chocolate", 5, 500);
        Factura f1 = new Factura(500, 15, "Caramelos", 15, -1000);
        
        System.out.println(f.obtenerMontoFactura());
        System.out.println(f1.obtenerMontoFactura());
    }
}
