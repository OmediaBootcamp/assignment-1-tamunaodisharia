package dev.omedia;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int initial = number;
        int reverse = 0;
        while(number != 0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return reverse == initial;
    }
}
