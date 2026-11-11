
package Ejercicio8;

public class CuentaDeAhorros {
    private static double tasaInteresAnual;
    double saldoAhorros;

    public CuentaDeAhorros() {
    }

    public CuentaDeAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    public static double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public static void setTasaInteresAnual(double tasaInteresAnual) {
        CuentaDeAhorros.tasaInteresAnual = tasaInteresAnual;
    }

    
    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    public void setSaldoAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }
    
    public void calcularlnteresMensual(){
        
        saldoAhorros += saldoAhorros * (tasaInteresAnual/100) / 12;
    
    }
    
    public static void modificarTasaInteres(double nuevaTasa) {
        tasaInteresAnual = nuevaTasa;
    }
}
