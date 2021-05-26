
package Entidades;
/**
 *
 * @author Hugo Takashi Vásquez Miranda
 */
public class Libro {
    private String codigo;
    private String titulo;
    private String categoria;
    private int stock;
    private Autor aut;

    public Libro(String codigo, String titulo, String categoria, int stock, Autor aut) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.categoria = categoria;
        this.stock = stock;
        this.aut = aut;
    }
    

    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor getAut() {
        return aut;
    }

    public void setAut(Autor aut) {
        this.aut = aut;
    }
    
    
    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", titulo=" + titulo + ", categoria=" + categoria + ", stock=" + stock + aut ;
    }
    
    
    
}
