
package Ejercicio2;
import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(1500);
        cuenta.setTipoInteres(2);
        
        System.out.println("Saldo actual: $" + cuenta.getSaldo());
        System.out.println("Tipo de interes actual: " + cuenta.getTipoInteres() + "%");
        System.out.println("");
        System.out.println("Ingrese el tipo de interes nuevo: "); 
        cuenta.setTipoInteres(sc.nextDouble());
        System.out.println("Ingrese cuanto dinero desea agregar a su cuenta: ");
        cuenta.setSaldo(sc.nextDouble());
        System.out.println("");
        System.out.println("Saldo actual: $" + cuenta.getSaldo());
        System.out.println("Tipo de interes actual: " + cuenta.getTipoInteres() + "%");
        System.out.println("Abonando intereses: " + cuenta.abonarIntereses());
        System.out.println("Ingrese cuanto dinero desea retirar: ");
        cuenta.retirarDinero(sc.nextDouble());
        System.out.println("Saldo final: $" + cuenta.getSaldo());
    }
}
