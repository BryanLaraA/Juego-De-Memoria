
package cartas;


public class Carta {
    
    private boolean estado;
    private String nombre;
    private boolean emparejada;

    public boolean isEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEmparejada() {
        return emparejada;
    }

    public Carta(boolean estado, String nombre, boolean emparejada) {
        this.estado = estado;
        this.nombre = nombre;
        this.emparejada = emparejada;
    }
    
}
