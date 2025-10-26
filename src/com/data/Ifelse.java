package com.data;

import java.sql.SQLOutput;

public class Ifelse {
    public static void main(String[] args) {
        int a = 7;
        int b = 7;

        //equals: so sanh
        boolean result1 = a > b;
        System.out.println("a > b: " + result1);

        boolean result2 = a <= b;
        System.out.println("a <= b: " + result2);

        boolean result3 = a + 3 > b;
        System.out.println("a + 3 > b: " + result3);

        boolean result4 = a != b;
        System.out.println("a != b: " + result4);

        //
        String fullname = "Quynh";
        String address = "Hung Yen";
        if (fullname.equals("Quynh")) {
            System.out.println("xin chao Quynh");
        }
        else {
            System.out.println("Ban khong phai Quynh");
        }

        if (address.equals("Hung Yen")) {
            System.out.println("Ban o Hung Yen");
        }
        else {
            System.out.println("Ban khong o Hung Yen");
        }
        // !: nguoc lai
        if (!fullname.equals(" Manh Quynh")) {
            System.out.println("Ban khong phai Quynh");
        }
        else {
            System.out.println("Xin chao Quynh");
        }

        if (!address.equals("HN")) {
            System.out.println("Ban khong o Hung Yen");
        }
        else {
            System.out.println("Ban o Hung Yen");
        }

        if (address.equals("TP.HCM")) {
            System.out.println("ban o TP.HCM");
        }
        else {
            System.out.println("Ban o Hung Yen");
        }
    }
}
