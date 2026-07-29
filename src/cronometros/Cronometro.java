/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cronometros;

import javax.swing.Timer;

/**
 *
 * @author lenno
 */
public class Cronometro {

    private int segundos;
    private final Timer timer;

    public Cronometro() {
        segundos = 0;

        timer = new Timer(1000, evento -> Aumentar_tiempo());
    }

    private void Aumentar_tiempo() {
        segundos++;
    }

    public void iniciar() {
        timer.start();
    }

    public void detener() {
        timer.stop();
    }

    public void reiniciar() {
        segundos = 0;
    }

    public int getTiempo() {
        return segundos;
    }

    public String getTiempo_reiniciado() {
        int minutos = segundos / 60;
        int seg = segundos % 60;

        if (seg < 10) {
            return minutos + ":0" + seg;
        } else {
            return minutos + ":" + seg;
        }
    }
}
