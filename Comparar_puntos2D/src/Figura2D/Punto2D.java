
package Figura2D;

public class Punto2D {
          //Variables de instancia
    private double x;
    private double y;
    
    //Constructor
    Punto2D(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    //Metodos set->modificar el atributo
    public void setX(double x){
        this.x=x;
          }
    public void setY(double y){
        this.y=y;
          }
    
    //Metodo get-> obtener el atributo
    public double getX(){
        return x;
          }
    public double getY(){
        return y;
    }
    
    //Comprar 2 puntos 
    public String comparar2Puntos(Punto2D p){
        
         if(this.x == p.x && this.y == p.y)
             return "son iguales";
         else 
             return "no son iguales";
    
    }
    
    //Metodo Distancia
    public double calcularDistancia(Punto2D p){
        double d;
        
            d=Math.sqrt(Math.pow((p.x - this.x),2)+ Math.pow((p.y - this.y),2));
            
            return d;
         }

    
        public String toString(String text) {
        return "Punto " + text+ ": x= " + x + ", y= " + y; 
    }
    
    
    
    
}
