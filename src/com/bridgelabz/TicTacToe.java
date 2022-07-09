package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {

    static char[] gameBoard = new char[10];

    static Scanner scanner = new Scanner(System.in);

    public static void createBoard() {
        System.out.println(gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2]);
        System.out.println(gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5]);
        System.out.println(gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8]);
    }


    public static char user() {
        System.out.println("Enter your choice  X or 0 only");
        return scanner.next().toUpperCase().charAt(0);
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe");
        createBoard();
        user();
    }
}
