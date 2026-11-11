
package Ejercicio6;

public class ComisionesLenovo {
    int articulo;
    int cantidad;
    double total;
    double ventas;
    int  base = 2000;

    public ComisionesLenovo() {
    }

    public ComisionesLenovo(int articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    public int getArticulo() {
        return articulo;
    }

    public void setArticulo(int articulo) {
        this.articulo = articulo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }
    
    
    
    public void calcularVentas(){
        switch (articulo) {
            case 1 -> ventas += (7239.99 * cantidad);
            case 2 -> ventas += (9129.75 * cantidad);
            case 3 -> ventas += (6899.95 * cantidad);
            case 4 -> ventas += (13150.89 * cantidad);
        }
    }
    
    public double calcularIngresos(){
        total = ventas + base;
        total += ventas * 6/100;
        return total;
    }
    
}
