
package cartas;


public class Carta {
    
    private boolean estado;
    private int nombre;
    private boolean emparejada;

    public boolean isEstado() {
        return estado;
    }

    public int getNombre() {
        return nombre;
    }

    public boolean isEmparejada() {
        return emparejada;
    }

    public Carta(boolean estado, int nombre, boolean emparejada) {
        this.estado = estado;
        this.nombre = nombre;
        this.emparejada = emparejada;
    }
    
}
