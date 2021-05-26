
package figuras2D;

public class Rectangulo2D {
    private Punto2D P1;
    private Punto2D P2;

    public Rectangulo2D(Punto2D P1, Punto2D P2) {
        this.P1 = P1;
        this.P2 = P2;
    }
    
    
    //Metodos set -> modificar el atributo
    public void setP1(Punto2D P1){
        this.P1=P1;
    }
    public void setP2(Punto2D P2){
        this.P2=P2;
    }
    
    //Metodos get -> obtener el atributo
    public Punto2D getP1(){
        return P1;
    }
    
    public Punto2D getP2(){
        return P2;
    }
    //Metodos calcular ancho 
    public double calcularAncho(){
        return P1.getX() - P2.getX();
    }
      
    //Metodos calcular largo 
    public double calcularLargo(){
        return P1.getY() - P2.getY();
     }
    public String toString() {
        return "Rectangulo2D( "+"p1= " +P1.toString("")+"; p2= "+P2.toString("")+")";
                
    }
    //Metodos calcular area
    public double calcularArea(){
        return this.calcularAncho() * this.calcularLargo();
    }
   
     //Metodos calcular perimetro
    public double calcularPerimetro(){
        return (this.calcularAncho() + this.calcularLargo())*2;
    }
   
   
    
    
}
