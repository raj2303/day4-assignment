package com.bridgelabz2.SnakeandLadder;

public class SnakeNladdersingleplayer {

    private static int position = 0;

    private static final int NO_PLAY_POSITION = 0;
    private static final int LADDER = 1;
    private static final int SNAKE = 2;
    private static int counter;

    public static void main(String[] args) {
        System.out.println("Starting position of the player = " + position);
        SnakeNladdersingleplayer game = new SnakeNladdersingleplayer();
        game.startGame();

    }

    private void startGame() {
        counter = 0;
        position = 0;

        while (position < 100) {

            int dice = rollDice();

            int check = positionLadderSnake();


            switch (check) {
                case NO_PLAY_POSITION:
                    System.out.println("Player remains on the same position...");
                    break;
                case LADDER:
                    position = position + dice;
                    System.out.println("Player get ladder & positon of the player = " + position);
                    break;
                case SNAKE:
                    position = position - dice;

                    if (position < 0) {
                        position = 0;
                        System.out.println("Player get snake & positon of the player = " + position);
                    }
            }

            if (position > 100) {
                position = position - dice;
                System.out.println("Player remains on the same position = " + position);
            }
            if (position == 100) {
                System.out.println("Congratulations!!!!Player won the game");
            }
        }

        System.out.println("Count of the dice= " + counter);
    }

    private int rollDice() {
        counter++;
        return (int) (Math.floor(Math.random() * 10) % 6 + 1);
    }

    private int positionLadderSnake() {
        return (int) (Math.floor(Math.random() * 10) % 3);
    }

    private void checkWinner() {
        if (counter % 2 == 0) {
            System.out.println("Player2 won the game.");
        } else {
            System.out.println("Player1 won the game.");
        }
    }
}