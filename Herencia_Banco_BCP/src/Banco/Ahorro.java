
package Banco;

public class Ahorro extends Cuenta{
    private double porcInte;
    
    //Constructor

    public Ahorro(long nroCuenta, String clave, double saldo, char tipMon,double porcInte) {
        super(nroCuenta, clave, saldo, tipMon); //envia los párametros al constructor de la Clase Padre
        this.porcInte = porcInte;
    }
    
//    Metodo set y get
    public double getPorcInte() {
        return porcInte;
    }

    public void setPorcInte(double porcInte) {
        this.porcInte = porcInte;
    }
    
//    Metodos adicionales
    @Override
    public boolean retirar(double monto){
       double monTmp;
        if(monto>3000 && monto<=super.getSaldo()){
           monTmp=monto + (monto*0.001);
           super.setSaldo(super.getSaldo()-monTmp);
           return true;
       }else
         super.retirar(monto);//Llama al metodo de la Clase Padre
        
        return true;
    }
    
    public double calcularInteres(){
        return super.getSaldo()*this.porcInte;
    } 
    
    
//    Metodo toString
    @Override
    public String toString() {
        return "Cuenta Ahorro{" + "porcInte= " + porcInte + '}';
    }

    
}
