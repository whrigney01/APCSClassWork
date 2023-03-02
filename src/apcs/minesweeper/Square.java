package apcs.minesweeper;

public class Square {
    private boolean isBomb;
    private int numOfBomb;

    private boolean isFlagged;

    private boolean isRevealed;
    public Square(){

    }

    public boolean isBomb() {
        return isBomb;
    }

    public int getNumOfBomb() {
        return numOfBomb;
    }

    public void setBomb(boolean bomb) {
        isBomb = bomb;
    }

    public void setNumOfBomb(int numOfBomb) {
        this.numOfBomb = numOfBomb;
    }

    public String toString(){
        if(isBomb){
            return "B";
        } else if(numOfBomb != 0){
            return Integer.toString(numOfBomb);
        }else{
            return "0";
        }
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public void setFlagged(boolean flagged) {
        isFlagged = flagged;
    }

    public boolean isRevealed() {
        return isRevealed;
    }

    public void reveal() {
        isRevealed = true;
    }
}
