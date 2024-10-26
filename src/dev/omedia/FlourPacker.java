package dev.omedia;

public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        int bigBag = 5;
        int bigBagTotal = bigCount * bigBag;
        if(bigBagTotal >= goal){
            return smallCount >= goal % bigBag;
        }else return smallCount >= goal - bigBagTotal;
    }
}
