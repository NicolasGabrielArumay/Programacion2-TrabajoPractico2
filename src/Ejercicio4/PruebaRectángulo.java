
package Ejercicio4;


public class PruebaRectángulo {
    public static void main(String[] args) {
        
        Rectángulo r = new Rectángulo();
        Rectángulo r1 = new Rectángulo();
        
        r.setLongitud(15);
        r.setAnchura(5);
        
        System.out.println("Perimetro: " + r.calcularPerimetro());
        System.out.println("Area: " + r.calcularArea());
        
        r1.setLongitud(-1);
        r1.setAnchura(0);
        
        System.out.println("Perimetro: " + r1.calcularPerimetro());
        System.out.println("Area: " + r1.calcularArea());
        
    }
}
