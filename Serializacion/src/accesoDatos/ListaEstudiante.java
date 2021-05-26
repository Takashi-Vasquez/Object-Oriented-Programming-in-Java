/**
*@Autor Vasquez Miranda, Hugo
*/
package accesoDatos;

import entidades.Estudiante;        //importa a clase estudiante de otro paquete
import java.io.*;                   //entrada y salida datos
import java.util.*;                 //importa colecciones
import javax.swing.JOptionPane;

public class ListaEstudiante {
    //Declaracion de variables de referencia
    Estudiante oE;
    ObjectOutputStream oup=null;
    ObjectInputStream inp=null;
    ArrayList<Estudiante> lstEst=null;
    File mf= null;
    
    //Contructor 

    public ListaEstudiante() {
        //Se crea la coleccion y se especifica que almacene Estudiante
        lstEst = new ArrayList<Estudiante>();
        //crea el fichero de texto
        mf= new File("ArchivoEstudiante.txt");
    }
    
    ///////Metodos de mantenimiento de la coleccion de estudiantes
    public void agegarEst(Estudiante oE){
        lstEst.add(oE);
    }
    
    public Estudiante buscarEstxId(String id){
        Estudiante oE=null;
        //Recorre la coleccion
        for (Estudiante e : lstEst) {
            if (id.equals(e.getId())) 
                oE=e;
        }
        return oE;
    }
    
    public Estudiante buscarEstxIndice(int i){
        return lstEst.get(i);
    }
    
    public void eliminarEst(Estudiante oE){
        lstEst.remove(oE);
    }
    
    public int obtenerNEst(){
        return lstEst.size();
    }
    
    public void modificarEst(int i, Estudiante oE){
        lstEst.set(i, oE);
    }
    
    public String listarEst(){
        String cad="";
        //Recorre la coleccion
        for (Estudiante c : lstEst) {
            cad= cad+c.toString()+"\n";
        }
        return cad; //Retorna la informacion de todos los estudiantes
    }
    
    //***********************Metodo de acceso al Archivo de texto******************//
    public void guardarArchivo(){
        try {
            //Permite la seralizacion
            oup= new ObjectOutputStream(new FileOutputStream(mf));
            
            //Escribe la coleccion en el archivo
            oup.writeObject(lstEst);
            //Cierra el archivo
            oup.close();
            JOptionPane.showMessageDialog(null, "Se Registró en Archivo","Guardar Archivo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error con Serializacion","Guardar Archivo",0);
        }
    }
     
    public String leerArchivo(){
        try {
            //Permite la deserializacion
            inp= new ObjectInputStream(new FileInputStream(mf));
            //Lee datos del archivo y lo pasa a una coleccion
            lstEst= (ArrayList<Estudiante>)inp.readObject();
            //Cierra el archivo
            inp.close();
        } catch (IOException | ClassNotFoundException e) {
             JOptionPane.showMessageDialog(null, "Error con archivo","Guardar Archivo",0);
        }
        //Llama al metodo listarEst() y devuelve la lista de estudiantes en cadena
        return listarEst();
    }
} 