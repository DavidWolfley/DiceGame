package edu.alma.wolfley1dd;

import java.util.*;

public class Handful {

    private ArrayList<Die> dice;

    /** With no parameters specified, creates 2d6. */
    public Handful(){
        dice = new ArrayList<Die>();
        for(int i = 0; i < 2; i++) {
            dice.add(new Die(6));
        }
    }
    /**
     * @param diceamount number of die objects to add to the Handful
     * @param dicemax number of faces on the die. Must be at least 4; otherwise a 6-sided die is created.
     */
    public Handful(int diceamount, int dicemax){
        dice = new ArrayList<Die>();
        if(diceamount < 2){
            diceamount = 2;
        }
        for(int i = 0; i < diceamount; i++) {
            dice.add(new Die(dicemax));
        }
    }
    /**
     * @return a list of each die's face value.
     */
    public List getdice(){
        List dicefaces = new ArrayList<Integer>();
        for(int i = 0; i < dice.size(); i++){;
            dicefaces.add(dice.get(i));
        }
        return dicefaces;
    }
    /**
     * @return the sum of the face values of each individual die.
     */
    public int getdicesum(){
        int dicesum = 0;
        for(int i = 0; i < dice.size(); i++){
            Die currentdie = dice.get(i);
            dicesum += currentdie.getFaceValue();
        }
        return dicesum;
    }
    /**
     * @param dieindex
     * @return the face value of the die at the specified index.
     */
    public int getdie(int dieindex){
        Die die = dice.get(dieindex);
        return die.getFaceValue();
    }
    /**
     * @return the sum of the face values of each die after rolling.
     */
    public List rolldice(){
        for(int i = 0; i < dice.size(); i++){
            Die currentdie = dice.get(i);
            currentdie.roll();
        }
        return getdice();
    }
}
