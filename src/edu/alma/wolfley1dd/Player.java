package edu.alma.wolfley1dd;

import java.util.Scanner;

public class Player {

    protected int score = 0;
    protected Scanner scanner = new Scanner(System.in);
    PairOfDice dice = new PairOfDice();
    protected boolean playerturn = false;
    private int pointsacquired = 0;
    private String name;

    public boolean isturn() {
        return playerturn;
    }

    public int getPointsacquired() {
        return (pointsacquired);
    }

    public void setName(String newname) {
        name = newname;
    }

    public String getName() {
        return name;
    }

    int getScore() {
        return score;
    }

    public void continueText() {
        /**
         * Pauses execution of code, allowing user to read each line before printing the next
         * by pressing enter.
         */
        System.out.println("Press enter to continue:");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    public void roll() {
        /**
         * Calls the Roll() method on the PairOfDice, either ending the players turn if rolling a 1,
         * or reducing player's score to 0 when rolling snake eyes.
         */
        dice.rolldice();
        if (dice.getdie1() == 1 && dice.getdie2() == 1) {
            pointsacquired = 0;
            score = 0;
            playerturn = false;
            System.out.println("No points this turn, rolled snake eyes");
        } else if (dice.getdie1() == 1 || dice.getdie2() == 1) {
            pointsacquired = 0;
            playerturn = false;
            System.out.println("No points this turn, rolled " + dice.getdie1() + " and " + dice.getdie2());
        } else {
            pointsacquired = pointsacquired + dice.getdice();
            System.out.println(name + " rolled " + dice.getdice());
        }

        dice.getdice();
    }

    void turn() {
        dice.rolldice();
    }
}


