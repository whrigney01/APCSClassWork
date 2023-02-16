package apcs.penny;

public class Square {
    private int score;
    private boolean esOcupado;

    public Square(int score){
        this.score = score;
        this.esOcupado = false;
    }

    public int getScore() {
        return score;
    }

    public boolean isOccupied() {
        return esOcupado;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setOccupied(boolean esOcupado) {
        this.esOcupado = esOcupado;
    }

    @Override
    public String toString() {
       if(!esOcupado){
           return String.valueOf(score);
       }else{
           return "P";
       }
    }
}
