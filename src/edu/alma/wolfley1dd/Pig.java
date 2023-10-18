package edu.alma.wolfley1dd;

import java.util.Scanner;

public class Pig {
    /**
     * Alternates between the turns of two Players until one of them reaches a score of 100,
     * then exits the program.
     */
    private static Player Player1;
    private static Player Player2;

    static Player currentPlayer;

    static Scanner input = new Scanner(System.in);

    public static void setPlayer(int i) {
        /**
         * Asks the user whether the current player is a human or computer, and sets the value of Player1 or Player2 to
         * either Human or Computer.
         */
        System.out.println("Would you like Player " + i  + " to be a human or computer?");
        String inputString = input.nextLine();
        if (inputString.equals("human") && i == 1) {
            Player1 = new HumanPlayer();
        }
        else if (inputString.equals("computer") && i == 1) {
            Player1 = new ComputerPlayer();
        }
        else if (inputString.equals("human") && i == 2) {
            Player2 = new HumanPlayer();
        }
        else if (inputString.equals("computer") && i == 2) {
            Player2 = new ComputerPlayer();
        }
    }

    public static void setPlayerName(int i){
        System.out.println("What would you like the name of Player " + i + " to be?");
        String inputString = input.nextLine();
        if(i == 1){
            Player1.setName(inputString);
        }
        else if(i == 2){
            Player2.setName(inputString);
        }
    }

    public static void nextPlayer(){
        if(currentPlayer == Player1){
            currentPlayer = Player2;
        }
        else if (currentPlayer == Player2){
            currentPlayer = Player1;
        }
    }


    public static void main(String[] args) {
        setPlayer(1);
        setPlayerName(1);
        setPlayer(2);
        setPlayerName(2);
        currentPlayer = Player1;

    while(Player1.getScore() < 100 && Player2.getScore() < 100) {
        currentPlayer.turn();
        if(currentPlayer.getScore() >= 100){
            System.out.println(currentPlayer.getName() + " Wins");
            System.exit(0);
        }
        nextPlayer();
        }
    }
}
