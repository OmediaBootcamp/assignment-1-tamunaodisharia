package dev.omedia;

public class NumberToWords {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
            return;
        }
        if(number == 0){
            System.out.println("Zero");
            return;
        }

        int reversed = reverse(number);
        int reversedDigitCount = getDigitCount(reversed);
        int numberDigitCount = getDigitCount(number);

        String word = "";
        while(reversed != 0){
            int lastDigit = reversed % 10;
            word = switch(lastDigit){
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "";
            };
            System.out.print(word + " ");
            reversed /= 10;
        }

        for(int i = 0; i < numberDigitCount - reversedDigitCount; i++){
            System.out.print("Zero" + " ");
        }
    }
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        int count = 0;
        while(number != 0){
            count++;
            number /= 10;
        }
        return count;
    }
    public static int reverse(int number){
        int initial = number;
        int reverse = 0;
        while(number != 0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return reverse;
    }
}
