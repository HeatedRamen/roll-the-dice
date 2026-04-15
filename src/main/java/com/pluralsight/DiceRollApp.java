package com.pluralsight;

public class DiceRollApp {
    public static void main(String[] args) {

        Dice dice = new Dice();
        Thread thread = new Thread();
        int roll1, roll2, sum;

        for (int count = 0; count < 100 ; count++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;

            outputRoll(roll1, roll2, sum, count);
        }

    }
    static void println(String message){
        System.out.println(message);
    }

    static void outputRoll(int roll1 , int roll2 , int sum, int count){
        println("Roll " + count +" :\t" + roll1 + "\t-\t" + roll2 + "\tSum: " + sum);
    }
    static
}
