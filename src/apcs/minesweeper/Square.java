package apcs.minesweeper;

public class Square {
    private boolean isBomb;
    private int numOfBomb;

    private boolean isFlagged;

    private boolean isRevealed;

    public Square() {

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

    public String toString() {
        if (isFlagged) {
            int[] surrogates = {0xD83D, 0xDEA9};
            String flag = new String(surrogates, 0, surrogates.length);
            return (flag);
        } else if (isBomb) {
            int[] surrogates = {0xD83D, 0xDCA3};
            String bomb = new String(surrogates, 0, surrogates.length);
            return (bomb);
        } else if (numOfBomb != 0) {
            return String.valueOf(numOfBomb);
        } else {
            return "0";
        }
    }

        public boolean isFlagged () {
            return isFlagged;
        }

        public void setFlagged (boolean flagged){
            isFlagged = flagged;
        }

        public boolean isRevealed () {
            return isRevealed;
        }

        public void reveal () {
            isRevealed = true;
        }
    }
