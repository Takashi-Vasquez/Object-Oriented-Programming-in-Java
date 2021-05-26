package AccesoDatos;
import Cliente.Cliente;
import Entidades.Cuenta;
import java.util.*;
public class ListaCuentas {
    
    private ArrayList<Cuenta> cuentas;

    public ListaCuentas() {
        cuentas= new ArrayList<Cuenta>();
    }
    //Metodo de mantenimiento
    public long agregarCta(Cliente cli, double  s){
        Cuenta oC= new Cuenta(cli, s);
        cuentas.add(oC);
        return oC.getNro();
    }
    
    public boolean eliminarCta(Cuenta oC){
       
            cuentas.remove(oC);
            return true;
        
    }
    
    public Cuenta buscarCtaxNro(long nro){
        Cuenta oCta=null;
        for (Cuenta c : cuentas) 
            if(nro==c.getNro())
                    oCta=c;
        
        return oCta;
    }
    
    public Cuenta buscarCtaxCliente(String cli){
        Cuenta oCta=null;

        for (Cuenta c : cuentas) 
            if(c.getCliente().equalsIgnoreCase(cli))
               oCta=c;
        
        return oCta;
    }        
    
    public Cuenta buscarCtaxIndice(int i){
        
        return cuentas.get(i);
        
    }
    
    public void buscarCtaxIndice(Cuenta oC){
        
        cuentas.remove(oC);
        
    }
    
    public int obtenerNCtas(){
        return cuentas.size();
    }
    
    public void Listar(int n){
        System.out.println("\nReporte");
        for (int i = 0; i < n; i++) {
            Cuenta oC;
            oC=this.buscarCtaxIndice(i);
            System.out.println(oC.toString());
        }
    }
}
