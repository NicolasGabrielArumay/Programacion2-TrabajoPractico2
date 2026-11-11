
package Ejercicio4;


public class Rectángulo {
    double longitud = 1;
    double anchura = 1;

    public Rectángulo() {
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        if (longitud > 0.0 && longitud < 20.0)
        this.longitud = longitud;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        if (anchura > 0.0 && anchura < 20.0)
        this.anchura = anchura;
    }
    
    
    public double calcularPerimetro(){
        
        double perimetro;
        
        perimetro = longitud + longitud + anchura + anchura;
        
        return perimetro;   
    }
    
    public double calcularArea(){
        
        double area;
        
        area = longitud * anchura;
        
        return area; 
        
        
    }
    
    
}
