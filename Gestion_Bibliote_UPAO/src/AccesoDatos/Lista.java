/**
 *
 * @author Hugo Takashi Vásquez Miranda
 */
package AccesoDatos;
import Entidades.Libro;
import Entidades.Autor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Lista  {
  static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));  
    private ArrayList<Libro> list;

    public Lista() {
        list= new ArrayList<Libro>();
    }
    
    //Metodo de mantenimiento
    public void agregarLibro(String codigo, String titulo, String categoria, int stock, Autor aut){
        Libro oL= new Libro(codigo, titulo, categoria, stock, aut);
        list.add(oL);
    }
    
    //Eliminar Libro
    public boolean EliminarLibro(Libro oL) {
 
                list.remove(oL);
                return true;

    }
    //Buscar por codigo
    public Libro BucarLibPorCodigo(String cod) {
        Libro oLi=null;
        
        Iterator<Libro> itr= list.iterator();
        while (itr.hasNext()) {
            Libro oL = itr.next();
            if(oL.getCodigo().equals(cod))
                oLi=oL;
        }
        return oLi;
    }
    //Buscar por indice
    public Libro buscarLibPorIndice(int i){
        
        return list.get(i);
        
    }
    //Buscar libros por autor y imprimir los libros
    public String buscarLibAutor(String aut){
        Libro oLi;
        String cad="";
        for (Libro oL : list){ 
            if(aut.equals(oL.getAut().getNombre())){
               oLi=oL;
               cad+=oLi+"\n";
            }
        }
        return cad;
    } 
    
    //Se esta comprando libro existente y si no se encuentra el entonces retorna un mesaje comunicando que no existe
    public boolean comprarLibro(String cod)throws IOException{
        int nCnt, cant;
        
        Libro oL = BucarLibPorCodigo(cod);
        cant=cantLibComprar();
        if (oL==null) 
            System.out.println("Libro no existe");
        if (cant > 0 ) {
            nCnt = oL.getStock()+cant;
            oL.setStock(nCnt);            
            return true;
        }else
            return false;
    }
    
    //Listando los datos del libro 
    public void Listar(int n){
        System.out.println("\nReporte");
        for (int i = 0; i < n; i++) {
            Libro oL;
            oL=this.buscarLibPorIndice(i);
            System.out.println(oL.toString());
        }
    }
    //Obtener el tamaño de la lista
    public int obtenerNLib(){
        return list.size();
    }   
    //Ordenar lista por Autor
    public void ordenarPorAutor(Lista list) throws IOException{
	int stockaux;
        String codaux, tituloaux, categaux;
        Autor autaux;
        for(int i=0;i<obtenerNLib();i++){
            for (int j = 0; j < obtenerNLib(); j++) {
                if(list.buscarLibPorIndice(i).getAut().getNombre().compareTo(list.buscarLibPorIndice(j).getAut().getNombre())<0){
                        
                        codaux=list.buscarLibPorIndice(i).getCodigo();
                        list.buscarLibPorIndice(i).setCodigo(list.buscarLibPorIndice(j).getCodigo());
                        list.buscarLibPorIndice(j).setCodigo((codaux));
                        
                        tituloaux=list.buscarLibPorIndice(i).getTitulo();
                        list.buscarLibPorIndice(i).setTitulo(list.buscarLibPorIndice(j).getTitulo());
                        list.buscarLibPorIndice(j).setTitulo((tituloaux));
                        
                        categaux=list.buscarLibPorIndice(i).getCategoria();
                        list.buscarLibPorIndice(i).setCategoria(list.buscarLibPorIndice(j).getCategoria());
                        list.buscarLibPorIndice(j).setCategoria((categaux));
                        
                        stockaux=list.buscarLibPorIndice(i).getStock();
                        list.buscarLibPorIndice(i).setStock(list.buscarLibPorIndice(j).getStock());
                        list.buscarLibPorIndice(j).setStock((stockaux));
                        
                        autaux=list.buscarLibPorIndice(i).getAut();
                        list.buscarLibPorIndice(i).setAut(list.buscarLibPorIndice(j).getAut());
                        list.buscarLibPorIndice(j).setAut((autaux));
                }
            }
        }
  }
    //Ordenar lista por titulo
    public void ordenarPorTitulo(Lista list) throws IOException{
	int stockaux;
        String codaux, tituloaux, categaux;
        Autor autaux;
        for(int i=0;i<obtenerNLib();i++){
            for (int j = 0; j < obtenerNLib(); j++) {
                if(list.buscarLibPorIndice(i).getTitulo().compareTo(list.buscarLibPorIndice(j).getTitulo())<0){
                        
                        codaux=list.buscarLibPorIndice(i).getCodigo();
                        list.buscarLibPorIndice(i).setCodigo(list.buscarLibPorIndice(j).getCodigo());
                        list.buscarLibPorIndice(j).setCodigo((codaux));
                        
                        tituloaux=list.buscarLibPorIndice(i).getTitulo();
                        list.buscarLibPorIndice(i).setTitulo(list.buscarLibPorIndice(j).getTitulo());
                        list.buscarLibPorIndice(j).setTitulo((tituloaux));
                        
                        categaux=list.buscarLibPorIndice(i).getCategoria();
                        list.buscarLibPorIndice(i).setCategoria(list.buscarLibPorIndice(j).getCategoria());
                        list.buscarLibPorIndice(j).setCategoria((categaux));
                        
                        stockaux=list.buscarLibPorIndice(i).getStock();
                        list.buscarLibPorIndice(i).setStock(list.buscarLibPorIndice(j).getStock());
                        list.buscarLibPorIndice(j).setStock((stockaux));
                        
                        autaux=list.buscarLibPorIndice(i).getAut();
                        list.buscarLibPorIndice(i).setAut(list.buscarLibPorIndice(j).getAut());
                        list.buscarLibPorIndice(j).setAut((autaux));
                }
            }
        }
  }
    //Metodo estatico; consultando cuantos libros desea comprar
    static int cantLibComprar()throws IOException{
        int n;
        do{
            System.out.println("Cuantos Libros desea comprar");
            n=Integer.parseInt(br.readLine());
        }while(n<=0);
        return n;
    }
}
