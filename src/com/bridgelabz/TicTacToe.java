package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static char[] gameBoard = new char[10];

    static Scanner scanner = new Scanner(System.in);
    static char user = '1';
    static int userPosition;
    static char userTurn;
    static int computerPosition;
    static char computerTurn;
    static char exitCode = '0';
    static int turnCount;

    public static void createBoard() {
        System.out.println(gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2]);
        System.out.println(gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5]);
        System.out.println(gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8]);
    }

    public static char user(Scanner scanner) {
        System.out.println("Enter your choice  X or 0 only");
        return TicTacToe.scanner.next().toUpperCase().charAt(0);
    }

    public static void ticTacToe() {
        for (int i = 0; i < gameBoard.length; i++) {
            gameBoard[i] = ' ';
        }
    }

    public static void moveLocation() {
        if (user == '1') {
            System.out.print("Select the position in board from range [0 - 8] : ");
            userPosition = scanner.nextInt();

            switch (userPosition) {
                case 0:
                    if (gameBoard[0] == ' ') {
                        gameBoard[0] = userTurn;
                    }
                    break;
                case 1:
                    if (gameBoard[1] == ' ') {
                        gameBoard[1] = userTurn;
                    }
                    break;
                case 2:
                    if (gameBoard[2] == ' ') {
                        gameBoard[2] = userTurn;
                    }
                    break;
                case 3:
                    if (gameBoard[3] == ' ') {
                        gameBoard[3] = userTurn;
                    }
                    break;
                case 4:
                    if (gameBoard[4] == ' ') {
                        gameBoard[4] = userTurn;
                    }
                    break;
                case 5:
                    if (gameBoard[5] == ' ') {
                        gameBoard[5] = userTurn;
                    }
                    break;
                case 6:
                    if (gameBoard[6] == ' ') {
                        gameBoard[6] = userTurn;
                    }
                    break;
                case 7:
                    if (gameBoard[7] == ' ') {
                        gameBoard[7] = userTurn;
                    }
                    break;
                case 8:
                    if (gameBoard[8] == ' ') {
                        gameBoard[8] = userTurn;
                    }
                    break;
                default:
                    System.out.println("Choose correct number");

            }
        }
    }

    public static void computerMove() {
        boolean flag = false;
        while (true) {
            computerPosition = (int) (Math.random() * 8);
            switch (computerPosition) {
                case 0:
                    if (gameBoard[0] == ' ') {
                        gameBoard[0] = computerTurn;
                        flag = true;
                    }
                    break;

                case 1:
                    if (gameBoard[1] == ' ') {
                        gameBoard[1] = computerTurn;
                        flag = true;
                    }
                    break;

                case 2:
                    if (gameBoard[2] == ' ') {
                        gameBoard[2] = computerTurn;
                        flag = true;
                    }
                    break;

                case 3:
                    if (gameBoard[3] == ' ') {
                        gameBoard[3] = computerTurn;
                        flag = true;
                    }
                    break;

                case 4:
                    if (gameBoard[4] == ' ') {
                        gameBoard[4] = computerTurn;
                        flag = true;
                    }
                    break;

                case 5:
                    if (gameBoard[5] == ' ') {
                        gameBoard[5] = computerTurn;
                        flag = true;
                    }
                    break;

                case 6:
                    if (gameBoard[6] == ' ') {
                        gameBoard[6] = computerTurn;
                        flag = true;
                    }
                    break;

                case 7:
                    if (gameBoard[7] == ' ') {
                        gameBoard[7] = computerTurn;
                        flag = true;
                    }
                    break;

                case 8:
                    if (gameBoard[8] == ' ') {
                        gameBoard[8] = computerTurn;
                        flag = true;
                    }
                    break;

            }
            if (flag) {
                break;
            }

        }
    }

    public static void winner(char symbol) {

        if (gameBoard[0] != ' ' && gameBoard[0] == gameBoard[1] && gameBoard[1] == gameBoard[2]) {
            if (gameBoard[0] == symbol) {
                System.out.println("Player ONE WINS THE GAME");
            } else {
                System.out.println("Computer WINS THE GAME");
            }
            exitCode = '1';

        } else if (gameBoard[3] != ' ' && gameBoard[3] == gameBoard[4] && gameBoard[4] == gameBoard[5]) {
            if (gameBoard[3] == symbol) {
                System.out.println("Player ONE WINS THE GAME");
            } else {
                System.out.println("Computer WINS THE GAME");
            }
            exitCode = '1';
        } else if (gameBoard[7] != ' ' && gameBoard[6] == gameBoard[7] && gameBoard[7] == gameBoard[8]) {
            if (gameBoard[7] == symbol) {
                System.out.println("Player ONE WINS THE GAME");
            } else {
                System.out.println("Computer WINS THE GAME");
            }
            exitCode = '1';
        } else if (gameBoard[6] != ' ' && gameBoard[0] == gameBoard[3] && gameBoard[3] == gameBoard[6]) {
            if (gameBoard[6] == symbol) {
                System.out.println("Player ONE WINS THE GAME");
            } else {
                System.out.println("Computer WINS THE GAME");
            }
            exitCode = '1';
        } else if (gameBoard[1] != ' ' && gameBoard[1] == gameBoard[4] && gameBoard[4] == gameBoard[7]) {
            if (gameBoard[1] == symbol) {
                System.out.println("Player ONE WINS THE GAME");
            } else {
                System.out.println("Computer WINS THE GAME");
            }
            exitCode = '1';
        } else if (gameBoard[5] != ' ' && gameBoard[2] == gameBoard[5] && gameBoard[5] == gameBoard[8]) {
            if (gameBoard[5] == symbol) {
                System.out.println("Player ONE WINS THE GAME");
            } else {
                System.out.println("Computer WINS THE GAME");
            }
            exitCode = '1';
        } else if (gameBoard[4] != ' ' && gameBoard[0] == gameBoard[4] && gameBoard[4] == gameBoard[8]) {
            if (gameBoard[4] == symbol) {
                System.out.println("Player ONE WINS THE GAME");
            } else {
                System.out.println("Computer WINS THE GAME");
            }
            exitCode = '1';
        } else if (gameBoard[2] != ' ' && gameBoard[2] == gameBoard[4] && gameBoard[4] == gameBoard[6]) {
            if (gameBoard[2] == symbol) {
                System.out.println("Player ONE WINS THE GAME");
            } else {
                System.out.println("Computer WINS THE GAME");
            }
            exitCode = '1';
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe ");
        ticTacToe();
        userTurn = user(scanner);
        computerTurn = (userTurn == 'X') ? 'O' : 'X';
        createBoard();
        int Toss;
        int wonToss;
        System.out.println("Choose\n 0. Heads\n 1. Tails\nEnter you choice [0-1] : ");
        Toss = scanner.nextInt();
        Random random = new Random();
        wonToss = random.nextInt(2);

        if (wonToss == Toss) {
            System.out.println("You won the toss");
            while (true) {
                moveLocation();
                System.out.println("Your board");
                createBoard();
                winner(userTurn);
                if (exitCode == '1') {
                    break;
                }
                computerMove();
                System.out.println("Computer Board");
                createBoard();
                winner(computerTurn);
                if (exitCode == '1') {
                    break;
                }
            }
        } else {
            System.out.println("Computer won the toss");
            while (true) {
                computerMove();
                System.out.println("Computer Board");
                createBoard();
                winner(computerTurn);
                if (exitCode == '1') {
                    break;
                }
                System.out.println("Your Turn");
                moveLocation();
                System.out.println("Your board");
                createBoard();
                winner(userTurn);
                if (exitCode == '1') {
                    break;
                }
            }
        }
    }
}



