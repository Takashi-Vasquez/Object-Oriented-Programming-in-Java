
package figuras2D;

public class Poligono2D {
    
//    Variable que declara un arreglo
    private Punto2D puntos[];
    
//    Variable que cuenta los objetos y maneja la posicion del arreglo
    private int nroVert;

//    Contructor vacio 
    public Poligono2D() {
        puntos = new Punto2D[100];  //Creación del arreglo de Objetos
        nroVert=0;
    }
    
//    Agregar Vertices
    public boolean agregarVertice(Punto2D p){
        if(getNroVert()<100){
           puntos[getNroVert()]=p;  //Agrega eñ Obj al arreglo
           nroVert++;
           return true;
        }else 
            return false;
    }   
//    Metodo Get y Set
    public int getNroVert() {
        return nroVert;
    }

    public void setNroVert(int nroVert) {
        this.nroVert = nroVert;
    }
    
    public Punto2D getVertice(int i) {
        return puntos[i];
    }
    
    public void setVertice(int i, Punto2D p) {
        puntos[i]= p;
    }
    
    public int getNroLados(){
        return nroVert;
    }
    
//    Verifica si está vacio
    public boolean verificarPoligono(){
        if(nroVert==0)
            return true;//vacio
        else
            return false;//no vacio
    }


    public double calcularPerimetro(){
        double perim=0,d;
        Punto2D p1,p2;
        for (int i = 0; i < nroVert-1; i++) {
          p1=puntos[i];
          p2=puntos[i+1];
          d= p1.calcularDistancia(p2);
          perim=perim+d; //perim=perim + puntos[i].calcularDistancia(puntos[i+1]);
          
        }
//      Se hubica el 1er y ultimo punto
        d= puntos[0].calcularDistancia(puntos[nroVert-1]);
        perim=perim+d;
        return perim;
    }

    @Override
    public String toString() {
        return "Poligono2D{" + "puntos=" + puntos + ", nroVert=" + nroVert + '}';
    }
    
    public String listarPuntos(){
        String cad="";
            for (int i = 0; i < nroVert; i++) {
                cad=cad+" ["+i+"] "+puntos[i].toString("")+"\n";
                
            }
          return cad;
    }

    
    
    
    
    
    
}
