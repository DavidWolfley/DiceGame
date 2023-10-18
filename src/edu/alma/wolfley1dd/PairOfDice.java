package edu.alma.wolfley1dd;

public class PairOfDice {
    /**
     * Represents 2 dice which are able to roll together but be read individually.
     */
   private Die die1 = new Die(6);
   private Die die2 = new Die(6);

    PairOfDice() {
        Die die1 = new Die(6);
        Die die2 = new Die(6);
    }

   PairOfDice(Die input1, Die input2){
    Die die1 = input1;
    Die die2 = input2;
   }
   public int getdie1(){
       /**
        * @return face value of die1.
        */
       return die1.getFaceValue();
   }
    public int getdie2(){
        /**
         * @return face value of die2.
         */
        return die2.getFaceValue();
    }
    public int getdice(){
        /**
         * @return face value of the sum of both dice.
         */
        return die1.getFaceValue() + die2.getFaceValue();
    }
    public int rolldice(){
        /**
         * @return face value of dice after rolling both dice individually.
         */
       die1.roll();
       die2.roll();
       return getdice();
    }

}

