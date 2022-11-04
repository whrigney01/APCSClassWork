package apcs.guess;

import apcs.fraction.Fraction;

import java.util.Objects;

public class Value {
    private int value;

    public Value() {
        this.value = (int) (Math.random() * 100 + 1);
    }

    public Value(int vlaue) {
        this.value = vlaue;
    }

    public int getValue() {
        return value;
    }

    public boolean equals(Value other) {
        if (this.value == other.value) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean compare(String type, Value other) {
        if (type.equals("greater")) {

            if (this.value > other.getValue()) {
                return true;
            } else {
                return false;
            }
        } else {
            if (other.getValue() > this.getValue()) {
                return true;
            } else {
                return false;
            }
        }
    }
    public String toString() {
        return "" + value;
    }

}

