package com.learning.leet_code.palindrome_number;

public class Main {
    public static void main(String[] args) {
        int isPalindrom = 1111;
        boolean check = Main.isPalindrome(isPalindrom);
        System.out.println(check);
    }

    public static boolean isPalindrome(int x) {
        String buffer = "" + x;
        String palindrom = "";
        for(int i = buffer.length() - 1; i >= 0; i--) {
            palindrom += buffer.charAt(i);
        }

        if (palindrom.equals(x + "")) {
            return true;
        } else {
            return false;
        }
    }
}
