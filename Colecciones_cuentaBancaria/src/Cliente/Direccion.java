
package Cliente;

public class Direccion {
    
    private String direccion;
    private int nro=0;
    public Direccion(String direccion) {
            this.direccion = direccion;
        }

    public Direccion() {
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        nro++;
        return "direccion Nº "+nro+ "= " + direccion ;
    }

//    "Direccion del cliente{" 
    
}
