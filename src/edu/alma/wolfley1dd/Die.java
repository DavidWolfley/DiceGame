package edu.alma.wolfley1dd;

/**
 * Represents one die (singular of dice) with faces showing between 1 and max value
 */
public class Die {
    private final int MAX;  // maximum face value
    private int faceValue;  // current value shown on die

    /**
     * @param max number of faces on the die. Must be at least 4; otherwise a 6-sided die is created.
     */
    public Die(int max) {
        if (max >= 4) {
            MAX = max;
        } else {
            MAX = 6;
        }
    }

    /**
     * @return the current face value of the die
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     *
     * Changes face value of die.
     *
     * @param faceValue new desired face value. Must be at least 1 and no more than maximum face value of die, or else
     *                  no change is made.
     */
    public void setFaceValue(int faceValue) {
        if (faceValue > 0 && faceValue <= MAX) {
            this.faceValue = faceValue;
        }
    }

    /**
     *
     * Roll die to produce random value.
     *
     * @return random value between 1 and max face value of die.
     */
    public int roll () {
        faceValue = (int) (Math.random() * MAX) + 1;
        return faceValue;
    }

    public String toString() {
        return Integer.toString(faceValue);
    }
}
