package dev.omedia;

public class PositiveNegativeZero {
    public static void checkNumber(int number){
        String numberType = number == 0 ? "zero" : number > 0 ? "positive" : "negative";
        System.out.print(numberType);
    }
}
