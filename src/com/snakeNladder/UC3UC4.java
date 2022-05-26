package com.snakeNladder;

import static com.snakeNladder.UC1.*;
import static com.snakeNladder.UC2.rollDice;

public class UC3UC4 {
    public static void main(String[] args) {

         position = 0;
        final int ladder = 1;
        final int snake = 2;

        UC3UC4 game = new UC3UC4();


        game.startGame();

    }

    private void startGame() {

        while (position < 100) {

            int dice = rollDice();


            switch (position) {
                case 1:
                    System.out.println("Player remains on the same position..." + position);
                    break;
                case 2:
                    position = ladder + dice;
                    System.out.println("Player get ladder & position of the player = " + position);
                    break;
                case 3:
                    position = snake - dice;

                    System.out.println("Player get snake & position of the player = " + position);
                    break;
            }
        }
    }

    private int positionsnakeNladder() {
        return 0;
    }
}





