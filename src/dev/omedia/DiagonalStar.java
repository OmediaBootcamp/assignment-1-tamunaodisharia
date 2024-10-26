package dev.omedia;

public class DiagonalStar {
    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
            return;
        }
        for(int row = 1; row <= number; row++){

            for(int column = 1; column <= number; column++){
                if(row == 1 || row == number){
                    System.out.print("*");
                    continue;
                }
                if(column == 1 || column == number){
                    System.out.print("*");
                    continue;
                }
                if((row == column) || (column == number - row + 1)){
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
