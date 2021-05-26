
package Figura2D;

import Figura.Figura;

public abstract class Figura2D extends Figura{
    
    public Figura2D(int x, int y) {
        super(x, y);
    }
    
    public abstract double calcularPerimetro();
}
