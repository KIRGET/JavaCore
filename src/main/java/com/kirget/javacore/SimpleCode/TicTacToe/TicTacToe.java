package com.kirget.javacore.SimpleCode.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static final String EMTY = "   ", CROSS = " X ", ZERO = " 0 ";
    public static String ActivePlayers;

    // scheme of game field
    public static final int ROW = 3, COLLUMN = 3;
    public static String[][] FieldGame = new String[ROW][COLLUMN];
    public static int StatusGame;
    public static int GameOver = 0, GameNychya = 1, GameWin_X = 3, GameWin_0 = 4;
    public static Scanner in = new Scanner(System.in);



    public static void main(String[] args) {
        StartGame();
        do {
            EnterPlayersMove();
            FieldCheck();
            GameZone();

            if(StatusGame==GameWin_X) {
                System.out.println("'X' Выиграл");
            }
            else if(StatusGame==GameWin_0) {
                System.out.println("'0' Выиграл");
            }
            else if(StatusGame==GameNychya){
                System.out.println("Ничья");
            }
            ActivePlayers=(ActivePlayers==CROSS?ZERO:CROSS);


        }
        while (StatusGame==GameOver);

    }


    // Created method a start of game

    public static void StartGame() {
        for(int row = 0; row < ROW; row++) {
            for (int col = 0; col < COLLUMN; col++) {
                FieldGame [row] [col] = EMTY;
            }
        }

        ActivePlayers = CROSS;
        GameZone();
    }

    public static void EnterPlayersMove() {
        boolean EnterNamber = false;
        do {
            System.out.println("Игрок  '"+ActivePlayers+"', Введите строку от (1 - 3)  и столбец (1 - 3)");
            int col = in.nextInt() - 1;
            int row = in.nextInt() - 1;
            if (row>=0 && row<ROW && col>=0 && col<COLLUMN && FieldGame [row][col]==EMTY) {
                FieldGame [row][col] = ActivePlayers;
                EnterNamber = true;
            }
            else {
                System.out.println(" Попробуйте еще раз ("+(col + 1)+ "," + (row + 1)
                        +")");
            }
        }

        while (!EnterNamber);

    }

    // Field check for == result.
    public static void FieldCheck() {
        String check = Multiplication();
        if(check.equals(CROSS)) {
            StatusGame = GameWin_X;
        }
        else if(check.equals(ZERO)) {
            StatusGame = GameWin_0;
        }
        else if(FilledOut()) {
            StatusGame = GameNychya;
        }
        else {
            StatusGame = GameOver;
        }

    }

    public static boolean FilledOut() {
        for(int col=0; col<COLLUMN; col++) {
            for(int row=0; row<ROW; row++) {
                if(FieldGame[col][row]==EMTY) {
                    return false;
                }
            }
        }
        return true;

    }

    public static String Multiplication() {
        int coincidences;
        for(int row=0; row<ROW; row++) {
            coincidences=0;
            for(int col=0; col<COLLUMN; col++) {
                if(FieldGame[row][0]!=EMTY && FieldGame[row][0]==FieldGame[row][col]) {
                     coincidences++;
                }
            }
            if(coincidences==3) {
                return FieldGame [row][0];
            }
        }


        for(int col=0; col<COLLUMN; col++) {
            coincidences=0;
            for(int row=0; row<ROW; row++) {
                if(FieldGame[0][col]!=EMTY && FieldGame[0][col]==FieldGame[col][row]) {
                    coincidences++;
                }
            }
            if(coincidences==3) {
                return FieldGame [0][col];
            }
        }


        if(FieldGame[0][0]!= EMTY && FieldGame[0][0] == FieldGame[1][1] && FieldGame[0][0] == FieldGame[2][2]) {
            return FieldGame[0][0];

        }

        if(FieldGame[0][2]!= EMTY && FieldGame[0][1] == FieldGame[0][2] && FieldGame[2][0] == FieldGame[0][2]) {
            return FieldGame[0][2];

        }
        return EMTY;

    }

    public static void GameZone() {
        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COLLUMN; col++) {
                System.out.print(FieldGame [col][row]);
                if(col != COLLUMN -1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(row !=ROW -1) {
                System.out.println("_ _ _ _ _ _ _ _ ");
            }
        }
        System.out.println();
    }



}
