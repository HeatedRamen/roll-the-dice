package com.pluralsight;

public class DiceRollApp {
    public static void main(String[] args) {

        Dice dice = new Dice();
        int roll1, roll2, sum;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int count = 0; count < 100 ; count++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;

            switch(sum){
                case 2:
                    twoCounter++;
                    break;
                case 4:
                    fourCounter++;
                    break;
                case 6:
                    sixCounter++;
                    break;
                case 7:
                    sevenCounter++;
                    break;
                default: continue;
            }
            outputRoll(roll1, roll2, sum, count);
        }
        printCounter(twoCounter, fourCounter, sixCounter, sevenCounter);
    }
    static void println(String message){
        System.out.println(message);
    }

    static void outputRoll(int roll1 , int roll2 , int sum, int count){
        println("Roll " + count +" :\t" + roll1 + "\t-\t" + roll2 + "\tSum: " + sum);
    }
    static void printCounter(int twoCount, int fourCount, int sixCount, int sevenCount){
        println("Number of 2('s): " + twoCount);
        println("Number of 4('s): " + fourCount);
        println("Number of 6('s): " + sixCount);
        println("Number of 7('s): " + sevenCount);
    }
}
