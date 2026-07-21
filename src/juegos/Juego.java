package main;

import cartas.Carta;
import jugadores.Jugador;
import niveles.Nivel;
import tableros.Tablero;

public class Juego {

    private Tablero tablero;
    private Jugador jugador;
    private Nivel nivel;

    private Carta primeraCarta;
    private Carta segundaCarta;

    public Juego(Nivel nivel) {
        this.nivel = nivel;
        this.tablero = new Tablero(nivel);
        this.jugador = new Jugador(0,0,0);

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

        if (carta.isEmparejada()|| carta.isEstado()) {
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

        if (primeraCarta.getNombre()==segundaCarta.getNombre()) {

            primeraCarta.setEmparejada(true);
            segundaCarta.setEmparejada(true);

            jugador.incrementParejasEncontradas();
            jugador.incrementScore();

        } else {

            primeraCarta.setVisible(false);
            segundaCarta.setVisible(false);

            jugador.lowScore();
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