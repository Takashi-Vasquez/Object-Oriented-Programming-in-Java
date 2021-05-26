/**
 *
 * @author Hugo Takashi Vásquez Miranda
 */
package Entidades;

public class Autor {
    
    private String nombre;
    private String pais;

    public Autor(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        
    }

    public Autor() {
    }
 
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "\nAutor{" + "nombre=" + nombre + ", pais=" + pais + '}';
    }
    
    
}
