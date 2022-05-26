package com.snakeNladder;

public class  UC1 {
    public static int position = 0;

    public static final int ladder = 1;
    public static final int snake = 2;


    public static void main() {
        System.out.println("starting position of the player:" + position);
        UC1 game = new UC1();
        game.startGame();

    }

    public void startGame() {
    }
}