
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
        
        setCantidad(cantidad);
        setPrecio(precio);
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

    private void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public double getPrecio() {
        return precio;
    }

    private void setPrecio(double precio) {
        if (precio > 0.0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }
    
    public double obtenerMontoFactura(){
        double monto;
        
        monto = cantidad * precio;
        
        return monto;
    }
}
