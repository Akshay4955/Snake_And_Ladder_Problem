package com.bridgelabz.snake_ladder;

public class SnakeLadderGame {
    public static void main(String[] args) {

        int player1position = 0;
        int number = (int) Math.floor(Math.random() * 100) % 6 + 1;
        int option = (int) Math.floor(Math.random() * 10) % 3;
        switch (option) {
            case 0:
                player1position = player1position;
                break;
            case 1:
                player1position += number;
                break;
            case 2:
                player1position -= number;
                break;
        }
        System.out.println(player1position);
    }
}
