package com.data;

import java.sql.SQLOutput;

public class Operator {
    public static void main(String[] args) {
        int score1 = 30;
        int  score2 = 10;
        int total = score1 + score2;
        int result1 = score1 - score2;
        int result2 = score1 * score2;
        int result3 = score1 / score2;
        int result4 = score2 / score1;

        System.out.println("total: " + total);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);

        //chia lay du
        int a = 10;
        int b = 3;
        int c = a % b;
        System.out.println("result c: " + c );
    }
}
