
package Ejercicio3;

public class Factura {
    int numeroFactura;
    int numeroArticulo;
    String descripcion;
    int cantidad;
    double precio;

    public Factura(int numeroFactura, int numeroArticulo, String descripcion, int cantidad, double precio) {
        this.numeroFactura = numeroFactura;
        this.numeroArticulo = numeroArticulo;
        this.descripcion = descripcion;
        if(cantidad>0)
        this.cantidad = cantidad;
        if(precio>0)
        this.precio = precio;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public int getNumeroArticulo() {
        return numeroArticulo;
    }

    public void setNumeroArticulo(int numeroArticulo) {
        this.numeroArticulo = numeroArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double obtenerMontoFactura(){
        double monto;
        
        monto = cantidad * precio;
        
        return monto;
    }
}
