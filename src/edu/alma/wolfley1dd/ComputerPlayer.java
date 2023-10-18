package edu.alma.wolfley1dd;


public class ComputerPlayer extends Player {
    /**
     * Represents a Player in Pig, keeping track of score and turn operations.
     */

    public void turn() {
        /**
         * Starts the player's turn, calling the roll() method first, and if the roll doesn't end the turn,
         * the turn continues unless the player's points acquired is greater than 20.
         */
        System.out.println(getName() + "'s Turn");
        playerturn = true;
        roll();
        continueText();
        while (playerturn) {
            if (getPointsacquired() >= 20) {
                playerturn = false;
                }
            else{
                roll();
                continueText();
            }
        }
        score = score + getPointsacquired();
        System.out.println(getName() + "'s total score is now " + score);
        continueText();
    }
}
