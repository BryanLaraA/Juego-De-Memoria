
package controladores;

import cronometros.Cronometro;
import interfaz.frmJuego;
import interfaz.frmMenu;
import juegos.Juego;
import niveles.Nivel;
import tableros.Tablero;
public class ControladorJuego {
    
    private frmJuego frmjuego;
    private frmMenu frmmenu;
    private Cronometro cronometro;
    private Juego juego;
   
    
    public ControladorJuego (frmJuego frmjuego,frmMenu frmmenu,Cronometro cronometro,Juego juego){
        this.frmjuego = frmjuego;
        this.frmmenu = frmmenu;
        this.cronometro = cronometro;
       this.juego = juego;
    }
    
    public void iniciarJuego(Nivel nivel){
        juego = new Juego(nivel);
    }
    
}
