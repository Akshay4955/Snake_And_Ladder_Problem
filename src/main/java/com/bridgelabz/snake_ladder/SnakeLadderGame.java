package com.bridgelabz.snake_ladder;

public class SnakeLadderGame {
    public static final int WINNING_POSITION = 100;
    int diceCounter = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        int player1Position = 0, player2Position = 0;
        SnakeLadderGame snakeLadderGame = new SnakeLadderGame();
        while (player1Position < WINNING_POSITION && player2Position < WINNING_POSITION) {
            player1Position = snakeLadderGame.playGame(player1Position);
            //System.out.println("Player 1 position is " + player1Position);
            player2Position = snakeLadderGame.playGame(player2Position);
            //System.out.println("Player 2 position is " + player2Position);
        }

        System.out.println("No of times dice rolled: " + snakeLadderGame.diceCounter);
        if (player1Position > player2Position)
            System.out.println("Winner is Player 1");
        else
            System.out.println("Winner is Player 2");
    }

    int playGame(int position) {
        int diceNumber = (int) Math.floor(Math.random() * 100) % 6 + 1;
        diceCounter++;
        int option = (int) Math.floor(Math.random() * 10) % 3;
        switch (option) {
            case 0:
                break;
            case 1:
                position += diceNumber;
                position = playGame(position);
                break;
            case 2:
                position -= diceNumber;
                break;
        }

        if (position < 0) {
            position = 0;
        }

        if (position > WINNING_POSITION) {
            position -= diceNumber;
        }

        return position;
    }
}