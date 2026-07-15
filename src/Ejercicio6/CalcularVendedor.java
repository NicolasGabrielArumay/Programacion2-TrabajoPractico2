
package Ejercicio6;

public class CalcularVendedor {
    int articulo;
    double total;
    double ventas;
    int  base = 2000;

    public CalcularVendedor(int articulo) {
        this.articulo = articulo;
    }

    public int getArticulo() {
        return articulo;
    }

    public void setArticulo(int articulo) {
        this.articulo = articulo;
    }
    
    public void calcularVentas(){
        switch (articulo) {
            case 1:
                ventas += 7239.99;
                break;
            case 2:
                ventas += 9129.75;
                break;
            case 3:
                ventas += 6899.95;
                break;
            case 4:
                ventas += 13150.89;
                break;
        }
    }
    
    public double calcularIngresos(){
        total = base + ventas * 0.6;
        
        return total;
    }
    
}
