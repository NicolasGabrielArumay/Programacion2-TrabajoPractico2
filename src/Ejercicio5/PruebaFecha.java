
package Ejercicio5;

public class PruebaFecha {
    public static void main(String[] args) {
        Fecha f1 = new Fecha();
        Fecha f2 = new Fecha("Julio", 7, 2005);
        
        f1.setAño(2000);
        f1.setMes(-2);
        f1.setDia(-500);
        
        System.out.println("Fecha 1: ");
        f1.mostrarFecha();
        System.out.println("Fecha 2: ");
        f2.mostrarFecha();
    }
}
