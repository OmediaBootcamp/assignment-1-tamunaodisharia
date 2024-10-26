package dev.omedia;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second){
        return ((long) (first * 1000) == (long) (second * 1000));
    }
}
