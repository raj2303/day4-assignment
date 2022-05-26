package com.snakeNladder;

public class UC6
{
    private static int position = 0;


        private static final int NO_PLAY_POSITION = 0;
        private static final int LADDER = 1;
        private static final int SNAKE = 2;
        private static int counter;

        public static void main(String[] args) {
            System.out.println("Starting position of the player = " + position);
            UC6 game = new UC6();
            game.startGame();

        }

        private void startGame() {
            counter = 0;
            position = 0;

            while (position < 100) {

                int dice = rollDice();

                int check = positionLadderSnake();


                switch (check) {
                    case NO_PLAY_POSITION -> System.out.println("Player remains on the same position...");
                    case LADDER -> {
                        position = position + dice;
                        System.out.println("Player get ladder & positon of the player = " + position);
                    }
                    case SNAKE -> {
                        position = position - dice;
                        if (position < 0) {
                            position = 0;
                            System.out.println("Player get snake & positon of the player = " + position);
                        }
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
            return (int) (Math.floor(Math.random() * 10) % 6+ 1);
        }

        private int positionLadderSnake() {
            return (int) (Math.floor(Math.random() * 10) % 3);
        }
}
