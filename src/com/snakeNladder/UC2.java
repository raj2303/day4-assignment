package com.snakeNladder;

public class UC2 {

    public static void main(String[] args) {
        String Dice;

         rollDice();
        {

             Dice = String.valueOf((Math.floor(Math.random() * 10) % 6 + 1));
            System.out.println("Random integer value from 0 to 6 :" +(Dice));

        }
    }

    static int rollDice() {
        return 0;
    }
}
