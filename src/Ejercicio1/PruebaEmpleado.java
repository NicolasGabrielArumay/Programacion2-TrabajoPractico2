
package Ejercicio1;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juan", "Perez", 500);
        Empleado e2 = new Empleado("Roberto", "Carlos", 680);
        
        //Mostrar empleados
        System.out.println(e1);
        System.out.println(e2);
        
        //Aumento del 10%
        e1.setSalarioMensual(Math.round(e1.getSalarioMensual()*1.10));
        e2.setSalarioMensual(Math.round(e2.getSalarioMensual()*1.10));
        
        //Mostrar empleados con el nuevo aumento del 10%
        System.out.println(e1);
        System.out.println(e2);
    }
}
