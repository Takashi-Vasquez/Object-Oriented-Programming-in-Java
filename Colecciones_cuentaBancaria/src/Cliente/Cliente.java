package Cliente;

import AccesoDatos.ListaCuentas;



public class Cliente {
    
    String nombre;
    private Direccion direc[];
    private int cntDirec;
    private String dni;
    private char sexo;
    private ListaCuentas cta;

    
    public Cliente() {
    }
    
    public Cliente(String nombre, String dni, char sexo) {
        this.nombre = nombre;
        direc = new Direccion[50];
        this.dni = dni;
        this.sexo = sexo;
        cntDirec=0;
        
    }
    public int getCntDirec() {
        return cntDirec;
    }
    public boolean agregarDirec(Direccion direccion){
        if(cntDirec<50){
           direc[cntDirec]=direccion;
           cntDirec++;
           return true;
        }else
            return false;
    }
    
    public String listarDireccion(){
        String rep="";
        
        for (int i = 0; i < cntDirec; i++) {
            rep=rep+direc[i].toString()+"\n";
        }
        
        return rep;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", Dni=" + dni + ", sexo=" + sexo + '}';
    }
    
}
