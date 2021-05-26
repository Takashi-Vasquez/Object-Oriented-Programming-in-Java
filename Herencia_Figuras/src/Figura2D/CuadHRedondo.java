
package Figura2D;

public class CuadHRedondo extends Figura2D{
    
    private Circulo cir;
    private Rectangulo rec;

    public CuadHRedondo(int x, int y,double radio, double ancho) {
        super(x, y); //Invoca al constructor de la Superclase
        //Se crean los objetos
        cir=new Circulo( x, y,radio);
        rec=new Rectangulo( x, y,ancho, ancho);
        
    }
    
    //Metodo Set y Get

    public Circulo getCir() {
        return cir;
    }

    public void setCir(Circulo cir) {
        this.cir = cir;
    }

    public Rectangulo getRec() {
        return rec;
    }

    public void setRec(Rectangulo rec) {
        this.rec = rec;
    }
    
//Implementacion de los metodos abstractos 
    @Override
    public double calcularArea() {
        return rec.calcularArea()-cir.calcularArea();
    }

    @Override
    public double calcularPerimetro() {
        return rec.calcularPerimetro()-cir.calcularPerimetro();
    }
    
    
//    Metodo reporte

    @Override
    public String toString() {
        return "\nX: " + super.x + "\nY: "+super.y + "\nRadio: " + cir.getRadio() + "\nAncho:" + rec.getAncho() ;
    }
    
    
}
