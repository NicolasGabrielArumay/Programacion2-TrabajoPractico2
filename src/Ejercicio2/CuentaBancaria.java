
package Ejercicio2;

public class CuentaBancaria {
    private double saldo;
    private double tipoInteres;

    public CuentaBancaria() {
    }

    public CuentaBancaria(double saldo, double tipoInteres) {
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo >= 0) {
            this.saldo += saldo;
        } else{
            System.out.println("El saldo no puede ser negativo.");
        }
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        if(tipoInteres >= 0) {
            this.tipoInteres = tipoInteres;
        } else{
            System.out.println("El tipo de interés debe ser mayor a cero.");
        }
    }
    
    public void retirarDinero(double monto){
        if(monto < 0){
            System.out.println("No se puede retirar menos que 0.");
        
        } else if(monto>saldo){
            System.out.println("El monto a retirar excede el saldo de la cuenta.");
        } else{
            saldo -= monto;
        }
    }
    
    public double abonarIntereses() {
        
        saldo += saldo * (tipoInteres / 100);
        return saldo;
    }
    
}
