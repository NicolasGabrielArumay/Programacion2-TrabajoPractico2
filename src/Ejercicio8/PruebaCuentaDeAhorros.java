
package Ejercicio8;

public class PruebaCuentaDeAhorros {
    public static void main(String[] args) {
        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(20000.00);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(30000.00);
        CuentaDeAhorros.modificarTasaInteres(4.0);
        
        System.out.println("AHORRADOR 1: ");
        System.out.println("Interes: " + CuentaDeAhorros.getTasaInteresAnual());
        System.out.println("Saldo base: " + ahorrador1.getSaldoAhorros());
        ahorrador1.calcularlnteresMensual();
        System.out.println("Sueldo con el interes mensual: " + ahorrador1.getSaldoAhorros());
        System.out.println("");
        
        System.out.println("AHORRADOR 2: ");
        System.out.println("Interes: " + CuentaDeAhorros.getTasaInteresAnual());
        System.out.println("Saldo base: " + ahorrador2.getSaldoAhorros());
        ahorrador2.calcularlnteresMensual();
        System.out.println("Sueldo con el interes mensual: " + ahorrador2.getSaldoAhorros());
        System.out.println("");
        
        CuentaDeAhorros.modificarTasaInteres(5.0);
        
        System.out.println("AHORRADOR 1: ");
        System.out.println("Interes: " + CuentaDeAhorros.getTasaInteresAnual());
        System.out.println("Saldo base: " + ahorrador1.getSaldoAhorros());
        ahorrador1.calcularlnteresMensual();
        System.out.println("Sueldo con el interes mensual: " + ahorrador1.getSaldoAhorros());
        System.out.println("");
        
        System.out.println("AHORRADOR 2: ");
        System.out.println("Interes: " + CuentaDeAhorros.getTasaInteresAnual());
        System.out.println("Saldo base: " + ahorrador2.getSaldoAhorros());
        ahorrador2.calcularlnteresMensual();
        System.out.println("Sueldo con el interes mensual: " + ahorrador2.getSaldoAhorros());
        System.out.println("");
        
    }
}
