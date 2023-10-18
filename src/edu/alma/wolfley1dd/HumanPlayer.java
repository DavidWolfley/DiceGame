package edu.alma.wolfley1dd;

import java.util.Scanner;

public class HumanPlayer extends Player {
    /**
     * Represents a Player in Pig, keeping track of score and turn operations.
     */


    public void turn() {
        /**
         * Starts the player's turn, calling the roll() method first, and if the roll doesn't end the turn,
         * asks for player input to either roll again or end the turn.
         */
        System.out.println(getName() + "'s Turn");
        playerturn = true;
        roll();
        while (playerturn) {
            if(score >= 100){
                break;
            }
            System.out.println("Would you like to roll or end your turn?");
            String inputstring = scanner.nextLine();
            if (inputstring.equals("roll")) {
                roll();
            }
            else if (inputstring.equals("end")) {
                playerturn = false;
            }
        }
        score = score + getPointsacquired();
        System.out.println(getName() + "'s total score is now " + score);
        this.continueText();
    }
}