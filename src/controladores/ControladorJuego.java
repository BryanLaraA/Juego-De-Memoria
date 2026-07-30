
package controladores;

import cronometros.Cronometro;
import interfaz.frmJuego;
import interfaz.frmMenu;
import tableros.Tablero;
public class ControladorJuego {
    
    private frmJuego frmjuego;
    private frmMenu frmmenu;
    private Cronometro cronometro;
    private Tablero tablero;
    
    public ControladorJuego (frmJuego frmjuego,frmMenu frmmenu,Cronometro cronometro,Tablero tablero){
        this.frmjuego = frmjuego;
        this.frmmenu = frmmenu;
        this.cronometro = cronometro;
        this.tablero = tablero;
    }
    
    public void iniciarJuego(){
        
    }
    
}
