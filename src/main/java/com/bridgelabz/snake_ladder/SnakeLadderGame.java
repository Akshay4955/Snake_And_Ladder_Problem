package com.bridgelabz.snake_ladder;

public class SnakeLadderGame {
    public static final int WINNING_POSITION = 100;
    int diceCounter = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        int playerOnePosition = 0, playerTwoPosition = 0;
        SnakeLadderGame snakeLadderGame = new SnakeLadderGame();
        for (playerOnePosition = 0, playerTwoPosition = 0; playerOnePosition < WINNING_POSITION && playerTwoPosition < WINNING_POSITION;) {
            playerOnePosition = snakeLadderGame.playGame(playerOnePosition);
            //System.out.println("Player 1 position is " + playerOnePosition);
            playerTwoPosition = snakeLadderGame.playGame(playerTwoPosition);
            //System.out.println("Player 2 position is " + playerTwoPosition);
        }

        System.out.println("No of times dice rolled: " + snakeLadderGame.diceCounter + '\n' + "Players position are: " + playerOnePosition + " " + playerTwoPosition);
        if (playerOnePosition > playerTwoPosition)
            System.out.println("Winner is Player One");
        else
            System.out.println("Winner is Player Two");
    }

    int playGame(int position) {
        final int noPLay = 0, ladder = 1, snake = 2;
        int diceNumber = (int) Math.floor(Math.random() * 100) % 6 + 1;
        diceCounter++;
        int option = (int) Math.floor(Math.random() * 10) % 3;
        switch (option) {
            case noPLay:
                break;
            case ladder:
                position += diceNumber;
                if (position > WINNING_POSITION)
                    position -= diceNumber;
                position = playGame(position);
                break;
            case snake:
                position -= diceNumber;
                if (position < 0)
                    position = 0;
                break;
        }
        return position;
    }
}