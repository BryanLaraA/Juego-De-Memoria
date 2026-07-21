package jugadores;

/**
 *
 * @author Isaac
 */
public class Jugador {
  private int score; 
  private int attempts;
  private int parejasEncontradas;
  private int contScore;

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
    
    
    public Jugador(int score, int attempts, int parejasEncontradas) {
        this.score = score;
        this.attempts = attempts;
        this.parejasEncontradas = parejasEncontradas;
    }
  
  
}
