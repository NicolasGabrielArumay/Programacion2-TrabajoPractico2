
package Ejercicio5;

public class Fecha {
    int dia;
    int mes;
    int año;

    public Fecha(){
        
    }
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia>0 && dia<31){
            this.dia = dia;
        }else this.dia = 1;
        
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes>0 && mes<12){
            this.mes = mes;
        }else this.mes = 1;
        
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if(año>0){
            this.año = año;
        }else this.año = 1900;
    }
    
    public void mostrarFecha(){
        String[] meses = {
            "","Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        
        System.out.println(dia + "/" + mes + "/" + año);
        System.out.println(meses[mes] + " " + dia + ", " + año);
        System.out.println(dia + " " + meses[mes] + " " + año);    
    }
 }
