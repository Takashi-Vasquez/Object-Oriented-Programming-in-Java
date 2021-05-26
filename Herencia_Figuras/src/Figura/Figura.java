
package Figura;

public abstract class Figura {
    
    protected int x;
    protected int y;

//    Constructor
    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
//  Metodo set y get
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
//    Metodos abstractos
    
    public abstract double calcularArea();
    
    
    
}
