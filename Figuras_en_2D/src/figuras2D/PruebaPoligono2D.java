
package figuras2D;
import java.io.*;
public class PruebaPoligono2D {

    public static void main(String[] args) throws IOException {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//    Crear un Poligono vacio
    Poligono2D oPo1= new Poligono2D();
    //Creando objeto temporal
    Poligono2D objTemporal= new Poligono2D();
//**********Agregar 5 vertices al Poligono**********//    
//  1° Crear los puntos 
    Punto2D oP1 = new Punto2D(5, 10);
    Punto2D oP2 = new Punto2D(10, 15);
    Punto2D oP3 = new Punto2D(15, 20);
    Punto2D oP4 = new Punto2D(20, 25);
    Punto2D oP5 = new Punto2D(25, 30);

//  2° Agregar los vertices
    oPo1.agregarVertice(oP1);
    oPo1.agregarVertice(oP2);
    oPo1.agregarVertice(oP3);
    oPo1.agregarVertice(oP4);
    oPo1.agregarVertice(oP5);
    
//  Imprimir Lista de vertices
      
    System.out.println("\t **Vertices** ");
    System.out.print(oPo1.listarPuntos()+"\n");
    
//  Imprimir el perímetro del polígono
     
    System.out.print("Perímetro= "+oPo1.calcularPerimetro()+"\n");
    
// Imprimir el nro de vértices del polígono
    System.out.print("Número de Lados: "+oPo1.getNroVert()+"\n");

// Modificar un punto del polígono
    int i;

    System.out.print("La posición que desea modificar: ");
    i= Integer.parseInt(br.readLine());
    if(i<oPo1.getNroVert()){
        System.out.print("Coordenada x: ");
        double x= Double.parseDouble(br.readLine());
        System.out.print("Coordenada y: ");
        double y= Double.parseDouble(br.readLine());
        
        for(int j=0;j<5;j++){
            if(i==j){   
            Punto2D puntoTemporal = new Punto2D(x, y);
            objTemporal.agregarVertice(puntoTemporal);
            oPo1.setVertice(i, puntoTemporal);
            System.out.print(oPo1.listarPuntos()+"\n");
            }
        }
    }else{
        System.out.print("\n ¡Ingrese valor correcto! \n");
        
    }
    
    }
 }

