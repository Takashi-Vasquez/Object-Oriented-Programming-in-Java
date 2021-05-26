
package Banco;

public class Corriente extends Cuenta{
//    Atributos
    private double costMant;
    
//    Constructor

    public Corriente( long nroCuenta, String clave, double saldo, char tipMon,double costMant) {
        super(nroCuenta, clave, saldo, tipMon);
        this.costMant = costMant;
    }
    
    @Override
    public boolean depositar(double monto){
       double monTmp;
        if(monto>100 && monto<=super.getSaldo()){
           monTmp=monto - (monto*0.00005);
           super.setSaldo(super.getSaldo()+monTmp);
           return true;
       }else
         super.depositar(monto);//Llama al metodo de la Clase Padre
        
        return true;
    }
    
    public double calcularMantenimiento(){
        return this.costMant*super.getSaldo();
    }

    public double getCostMant() {
        return costMant;
    }

    public void setCostMant(double costMant) {
        this.costMant = costMant;
    }
    

//Metodo toString
    @Override
    public String toString() {
        return "Cuenta Corriente{" + "costMant= " + costMant + '}';
    }
    
    
}
