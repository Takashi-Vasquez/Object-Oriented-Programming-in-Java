
package Reporte_Fechas;


public class Fecha {
    
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
        this.dia = 0;
        this.mes = 0;
        this.año = 0;
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
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void reiniciarFecha(int dia, int mes, int año){
        
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        
    }
    
    public void adelantarFecha(int d, int m, int a){
        
        this.dia = d;
        this.mes = m;
        this.año = a;
        
    }

    @Override
    public String toString() {
        return +dia+ "/"+mes+"/"+año; 
    }
    
    public int validarFecha(){
        int c=0,nrod;
        
        nrod=nroDias(this.mes);
        if(this.dia>nrod){
            System.out.println("El día que ingresaste no es valido ");
            c++;
        }
        
        if(this.mes>12){
            System.out.println("El mes que ingresaste no es valido ");
            c++;
        }
        
        if(this.año<1){
            System.out.println("El año que ingresaste no es valido ");
            c++;
        }
        
        
        return c;
    }
    
    public int nroDias(int mes){
        int nroDias=0;
   
        if(mes==1){
            nroDias=31;
        }
        if(mes==2){
            nroDias=28;
        }
        if(mes==3){
            nroDias=31;
        }
        if(mes==4){
            nroDias=30;
        }
        if(mes==5){
            nroDias=31;
        }
        if(mes==6){
            nroDias=30;
        }
        if(mes==7){
            nroDias=31;
        }
        if(mes==8){
            nroDias=31;
        }
        if(mes==9){
            nroDias=30;
        }
        if(mes==10){
            nroDias=31;
        }
        if(mes==11){
            nroDias=30;
        }
        if(mes==12){
            nroDias=31;
        }
        
        return nroDias;
    }
    
    public void AñoBisiesto(){
        
        if((this.año%4==0)&&((this.año%400==0)^(this.año%100!=0))){
            System.out.println("\nEl año "+this.año+" Sí es un año bisiesto");
            
        }else{
            System.out.println("\nEl año "+this.año+" No es un año bisiesto");
        }
        
        
    }
}
