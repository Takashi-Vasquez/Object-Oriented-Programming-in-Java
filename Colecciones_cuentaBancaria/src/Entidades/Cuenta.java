package Entidades;

import Cliente.Cliente;

public class Cuenta {
        
    //Variables de Clase
    private static int  nCta=0;
    
    //Variables de instancia
    private long nro; 
    private Cliente cli;
    private double  saldo;


    public Cuenta(Cliente cli, double saldo) {
        nCta++;
        this.nro=nCta;
        this.cli = cli;
        this.saldo = saldo;
    }
    
    public static int getnCta() {
        return nCta;
    }
    
    public static void setnCta(int nCta) {
        Cuenta.nCta = nCta;
    }
    public String getCliente() {
        return cli.getNombre();
    }
    public void setCliente(String nom) {
        cli.setNombre(nom);
    }
    
    public String getDni() {
        return cli.getDni();
    }
    
    public void setDni(String dni) {
        cli.setDni(dni);
    }
    
    public long getNro() {
        return nro;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //Metodos adicionales
    public boolean retirar(double monto){
        if (monto<=saldo) {
            saldo-=monto;
            return true;
        }else
            return false;
    }
    
    public boolean depositar(double monto){
        if (monto>0) {
            saldo+=monto; 
            return true;
        }else
            return false;
    }
    
    public boolean transferir(Cuenta oCta, double monto){
        if (this.retirar(monto)==true) {
            oCta.depositar(monto);
            return true;
        }else
            return false;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nro=" + nro + ", cliente=" + cli.getNombre() + ", saldo=" + saldo + '}';
    }
    
}
            
