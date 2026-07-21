/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package niveles;

/**
 *
 * @author lenno
 */
public enum Nivel {

    PRINCIPIANTE(8),
    INTERMEDIO(16),
    AVANZADO(32);

    private final int parejas;

    Nivel(int parejas) {
        this.parejas = parejas;
    }

    public int getParejas() {
        return parejas;
    }

    public int getTotalCartas() {
        return parejas * 2;
    }
}
