package dev.omedia;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int first, int second, int third){
        if(!isValid(first) || !isValid(second) || !isValid(third)){
            return false;
        }
        int firstLastDigit = first % 10;
        int secondLastDigit = second % 10;
        int thirdLastDigit = third % 10;
        return firstLastDigit == secondLastDigit || secondLastDigit == thirdLastDigit || firstLastDigit == thirdLastDigit;
    }
    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }
}
