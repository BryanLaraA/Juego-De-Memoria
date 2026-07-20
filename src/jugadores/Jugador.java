package jugadores;

/**
 *
 * @author Isaac
 */
public class Jugador {
  private int score; 
  private int attempts;
  private int parejasEncontradas;

    public int getScore() {
        return score;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getParejasEncontradas() {
        return parejasEncontradas;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setParejasEncontradas(int parejasEncontradas) {
        this.parejasEncontradas = parejasEncontradas;
    }

    
    public boolean incrementScore(){
        int contScore = 0;
     if (parejasEncontradas ==1) {
        contScore++;
        return true;
    } else {
        return false;
    }
    }
            
//    public void contAttempts(){
//    int contattempts = 0; 
//    if (carta1.getNombre().equals(carta2.getNombre())) {
//    contattempts++;
//    }
//    }           
    
//    public void contAttempts(){
//    int contParejasEncontradas = 0; 
//    if (carta1.getNombre().equals(carta2.getNombre())) {
//    contParejasEncontradas++;
//    }
//    }   
    
    public Jugador(int score, int attempts, int parejasEncontradas) {
        this.score = score;
        this.attempts = attempts;
        this.parejasEncontradas = parejasEncontradas;
    }
  
  
}
