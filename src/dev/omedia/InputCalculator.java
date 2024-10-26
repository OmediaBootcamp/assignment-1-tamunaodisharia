package dev.omedia;

import java.util.Scanner;
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numCount = 0;
        long average = 0;
        while(true){
            try{
                int number = Integer.parseInt(scanner.nextLine());
                sum += number;
                numCount++;
            }catch(NumberFormatException e){
                break;
            }
        }
        average = Math.round((double)sum / numCount);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
