package com.srdesai;

import java.util.Arrays;

public class The2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        char currentChar = '1'; //this is starting character
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = currentChar++;
            }
        }

        //deeptostring is used for better readability and converting inner array to string
        System.out.println(Arrays.deepToString(board));

    }
}




