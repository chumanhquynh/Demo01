package com.data;

public class equalsIgnoreCase {
    public static void main(String[] args) {
        String fullName = "Quynh";

        //equals: so sanh phan biet chu hoa, chu thuong
        if (fullName.equals("quynh")) {
            System.out.println("Run1: Gia tri bang nhau");
        }
        else {
            System.out.println("Run1: Gia tri khong bang nhau");
        }

        //equalsIgnoreCase: so sanh khong phan biet chu hoa, chu thuong
        if (fullName.equalsIgnoreCase("quynh")) {
            System.out.println("Run2: Gia tri bang nhau");
        }
        else {
            System.out.println("Run2: Gia tri khong bang nhau");
        }

    }
}
