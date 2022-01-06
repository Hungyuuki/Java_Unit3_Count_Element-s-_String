package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kỳ: ");
        String string = input.next();
        System.out.println("In chuỗi: " + string);
        int countChar = string.length();
        System.out.println("Độ dài chuỗi là "+countChar);

        System.out.println("Nhập vào ký tự từ bàn phím: ");
        int count = 0;
        char character = input.next().charAt(0);
        for (int i = 0; i < string.length();i++){
            if (character == string.charAt(i)){
                count ++;
            }
        }
        System.out.println("Ký tự "+character+ " xuất hiện "+count+ " lần");
    }
}
