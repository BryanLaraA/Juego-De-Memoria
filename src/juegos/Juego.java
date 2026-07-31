package juegos;

import cartas.Carta;
import jugadores.Jugador;
import niveles.Nivel;
import tableros.Tablero;
import javax.swing.Timer;

public class Juego {

    private Tablero tablero;
    private Jugador jugador;
    private Nivel nivel;

    private Carta primeraCarta;
    private Carta segundaCarta;

    public Juego(Nivel nivel) {
        this.nivel = nivel;
        this.tablero = new Tablero(nivel);
        this.jugador = new Jugador();

        primeraCarta = null;
        segundaCarta = null;
    }

    public void nuevaPartida() {
        tablero = new Tablero(nivel);
        jugador = new Jugador();
        primeraCarta = null;
        segundaCarta = null;
    }

    public void seleccionarCarta(int fila, int columna) {
        Carta carta = tablero.obtenerCarta(fila, columna);
        if (carta.isEmparejada() || carta.isEstado()) {
            return;
        }
        carta.setVisible(true);

        if (primeraCarta == null) {
            primeraCarta = carta;
        } else {
            segundaCarta = carta;
            verificarPareja();
        }
    }

    private void verificarPareja() {
        jugador.incrementAttempts();

        if (primeraCarta.getNombre() == segundaCarta.getNombre()) {

            primeraCarta.setEmparejada(true);
            segundaCarta.setEmparejada(true);

            jugador.incrementparejas();
            jugador.incrementScore();

        } else {

            jugador.LowerScore();

            Carta carta1 = primeraCarta;
            Carta carta2 = segundaCarta;

            Timer timer = new Timer(2000, e -> {
                carta1.setVisible(false);
                carta2.setVisible(false);
            });

            timer.setRepeats(false);
            timer.start();
        }

        primeraCarta = null;
        segundaCarta = null;

        if (tablero.juegoFinalizado()) {
            finalizarJuego();
        }
    }

    public void finalizarJuego() {
        System.out.println("Juego finalizado");
        System.out.println("Puntaje: " + jugador.getScore());
        System.out.println("Intentos: " + jugador.getAttempts());
        System.out.println("Parejas encontradas: "
                + jugador.getParejasEncontradas());
    }

    public void cambiarNivel(Nivel nivel) {
        this.nivel = nivel;
        nuevaPartida();
    }

    public Tablero getTablero() {
        return tablero;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Nivel getNivel() {
        return nivel;
    }
}
