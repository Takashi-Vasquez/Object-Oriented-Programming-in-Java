/**
*@Autor Vasquez Miranda, Hugo
*/
package entidades;

import java.io.Serializable;
public class Estudiante implements Serializable{
    
    //Variable instancia
    private String id;
    private String nombres;
    private String carrera;
    
    //Contructor

    public Estudiante(String id, String nombres, String carrera) {
        this.id = id;
        this.nombres = nombres;
        this.carrera = carrera;
    }
    
    //Metodo set y get

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    //Reporte

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", nombres=" + nombres + ", carrera=" + carrera + '}';
    }
    
    
    
}
