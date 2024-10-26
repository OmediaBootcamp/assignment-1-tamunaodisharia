package dev.omedia;

public class SharedDigit {
    public static boolean hasSharedDigit(int first, int second){
        if(first < 10 || first > 99 || second < 10 || second > 99){
            return false;
        }
        int initialSecond = second;
        while(first != 0){
            int firstLastDigit = first % 10;
            second = initialSecond;
            while(second != 0){
                int secondLastDigit = second % 10;
                if(firstLastDigit == secondLastDigit){
                    return true;
                }
                second /= 10;
            }
            first /= 10;
        }
        return false;
    }
}
