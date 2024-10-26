package dev.omedia;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(temperature >= 25){
            if(summer && temperature <= 45){
                return true;
            }else return !summer && temperature <= 35;
        }
        return false;
    }
}
