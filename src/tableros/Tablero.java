
package tableros;
import cartas.Carta;
import niveles.Nivel;

public class Tablero {
    private Carta[][] tablero;
    private int filas;
    private int columnas;

    public Tablero(Nivel nivel) {
        switch (nivel){
            case PRINCIPIANTE: 
                filas = 4;
                columnas = 4;
                break;
            case INTERMEDIO: 
                filas = 8;
                columnas = 8;
                break;    
            case AVANZADO: 
                filas = 16;
                columnas = 16;
                break;    
        }
        tablero = new Carta[filas][columnas];
       
    }
    
    public void vaciarTablero() {
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            tablero[i][j] = null;
            }
        }
    }
    
    public void distribuirParejas() {
    int parejas = (filas * columnas) / 2;
    for (int i = 1; i <= parejas; i++) {
        Carta carta1 = new Carta(i);
        Carta carta2 = new Carta(i);
        colocarCarta(carta1);
        colocarCarta(carta2);
        }
    }
    
    private void colocarCarta(Carta carta) {
     boolean colocada = false;
        while (!colocada) {
            int fila = (int) (Math.random() * filas);
            int columna = (int) (Math.random() * columnas);
            if (tablero[fila][columna] == null) {
                tablero[fila][columna] = carta;
                colocada = true;
            }
        }
    }
    
    public Carta obtenerCarta(int fila, int columna) {
    return tablero[fila][columna];
    }
    
    public boolean compararCartas(Carta carta1, Carta carta2) {
    if (carta1.getNombre() == carta2.getNombre()) {
        carta1.setEmparejada(true);
        carta2.setEmparejada(true);
        return true;
        }
    return false;
    }
    
    public boolean juegoFinalizado() {
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            if (!tablero[i][j].isEmparejada()) {
                return false;
            }
        }
    }
    return true;
    }
   
    public void reiniciarTablero() {
    vaciarTablero();
    distribuirParejas();
    }  

    @Override
    public String toString() {
        return "Tablero{" + "tablero=" 
                + tablero + ", filas=" 
                + filas + ", columnas=" 
                + columnas + '}';
    }
   
}
