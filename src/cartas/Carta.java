
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

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setEmparejada(boolean emparejada) {
        this.emparejada = emparejada;
    }
    
    public void setVisible(boolean estado){
    }
    

    public Carta(int nombre) {
        this.nombre = nombre;
        this.estado = false;
        this.emparejada = false;
    }
    
}
