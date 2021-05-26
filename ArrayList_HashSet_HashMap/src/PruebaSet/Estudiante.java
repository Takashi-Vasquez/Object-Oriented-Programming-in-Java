package PruebaSet;
public class Estudiante implements Comparable{
    private String id;
    private String nombre;
    private int edad;

    public Estudiante(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Object obj) {
        //Indica en base a que atributos se comprar el objeto
        //Devuelve +1 si this es > que obj, -1 si this es < que objeto y 0 si son iguales
        Estudiante oE = (Estudiante)obj;
        return this.getNombre().compareTo(oE.getNombre());
    }
}
