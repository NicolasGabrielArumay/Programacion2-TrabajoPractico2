
package Ejercicio5;

public class PruebaFecha {
    public static void main(String[] args) {
        Fecha f1 = new Fecha();
        Fecha f2 = new Fecha(25, 12, 2002);
        
        f1.setAño(0);
        f1.setMes(-2);
        f1.setDia(-500);
        
        System.out.println("");
        System.out.println("FECHA 1: ");
        f1.mostrarFecha();
        System.out.println("");
        System.out.println("FECHA 2: ");
        f2.mostrarFecha();
    }
}
