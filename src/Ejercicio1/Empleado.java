
package Ejercicio1;

public class Empleado {
    
    String nombre;
    String apellido;
    double salarioMensual;

    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        if(salarioMensual>0){
            this.salarioMensual = salarioMensual;
        }else {
            salarioMensual = 0;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        
        if(salarioMensual>0){
            this.salarioMensual = salarioMensual;
        }else{
            System.out.println("Salario mensual invalido.");
        }
        
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + 
               "\nApellido: " + apellido + 
               "\nSalario mensual: " + salarioMensual +
               "\nSalario anual: " + salarioMensual*12;
    }
    
    
}
