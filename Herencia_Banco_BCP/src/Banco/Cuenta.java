package Banco;


public class Cuenta {
    //Atributos
    private long nroCuenta;
    private String clave;
    private double saldo;
    private char tipMon;

    public Cuenta(long nroCuenta, String clave, double saldo, char tipMon) {
        this.nroCuenta = nroCuenta;
        this.clave = clave;
        this.saldo = saldo;
        this.tipMon = tipMon;
    }
    
    //Metodo Set y Get
    public long getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(long nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public char getTipMon() {
        return tipMon;
    }

    public void setTipMon(char tipMon) {
        this.tipMon = tipMon;
    }
    
    //Metodo Adicionales
    public boolean depositar(double monto){
       if(monto>0){
           this.saldo=this.saldo+monto;
           return true;
       }else
           return false;
    }
    
    public boolean retirar(double monto){
       if(monto>0 && monto<=this.saldo){
           this.saldo=this.saldo-monto;
           return true;
       }else
           return false;
    }
    
    //reporte
   
    public String Cuenta(String msj) {
        return "Cuenta "+msj+"{" + "nroCuenta= " + getNroCuenta() + ", clave= " + 
                 "\""+getClave()+"\"" + ", saldo= " + getSaldo() + ", tipMon= " + 
                getTipMon() + '}';
    }
    
}
