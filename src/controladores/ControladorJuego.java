package controladores;

import cronometros.Cronometro;
import interfaz.frmJuego;
import interfaz.frmMenu;
import juegos.Juego;
import niveles.Nivel;

public class ControladorJuego {

    private frmJuego frmjuego;
    private frmMenu frmmenu;
    private Cronometro cronometro;
    private Juego juego;

    public ControladorJuego(frmJuego frmjuego, frmMenu frmmenu, Cronometro cronometro, Juego juego) {
        this.frmjuego = frmjuego;
        this.frmmenu = frmmenu;
        this.cronometro = cronometro;
        this.juego = juego;
    }

    public void iniciarJuego(Nivel nivel) {
        juego = new Juego(nivel);
        cronometro.reiniciar();
        cronometro.iniciar();
    }

    public void seleccionarCarta(int fila, int columna) {
        juego.seleccionarCarta(fila, columna);
    }

    public void nuevaPartida() {
        juego.nuevaPartida();
        cronometro.reiniciar();
        cronometro.iniciar();
    }

    public void volverAlMenu() {
        cronometro.detener();
        frmmenu.setVisible(true);
        frmjuego.dispose();
    }

    public Juego getJuego() {
        return juego;
    }
}