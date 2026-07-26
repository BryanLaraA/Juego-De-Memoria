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

    
    public void incrementScore(){
        score += 100;
    }
      
    public void incrementparejas(){
        parejasEncontradas ++;
    }
    
    public void LowerScore(){
        score -=20;
    }
    
    public void incrementAttempts(){
        attempts ++;
    }
    
    public Jugador() {
        this.score = 0;
        this.attempts = 0;
        this.parejasEncontradas = 0;
    }
  
  
}
