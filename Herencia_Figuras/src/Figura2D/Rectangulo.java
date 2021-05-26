
package Figura2D;

public class Rectangulo extends Figura2D{
    
    private double largo;
    private double ancho;
    
    //Constructor

    public Rectangulo( int x, int y,double largo, double ancho) {
        super(x, y);
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    

    @Override
    public double calcularArea() {
        return largo*ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(largo+ancho);
    }

    @Override
    public String toString() {
        return "\nX: " + super.x + "\nY: "+super.y + "\nlargo: " + this.largo + "\nancho:" + this.ancho ;
    }

    
    
    
    
}
