
package cartas;


public class Carta {
    
    private boolean estado;
    private int id;
    private boolean emparejada;

    public boolean isEstado() {
        return estado;
    }

    public int getNombre() {
        return id;
    }

    public boolean isEmparejada() {
        return emparejada;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setNombre(int id) {
        this.id = id;
    }

    public void setEmparejada(boolean emparejada) {
        this.emparejada = emparejada;
    }
    
    public void setVisible(boolean estado){
        this.estado = estado;
    }
    
    public Carta(int id) {
        this.id = id;
        this.estado = false;
        this.emparejada = false;
    }
    
}
