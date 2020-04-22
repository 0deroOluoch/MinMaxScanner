package com.appnetics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int counter = 1;
        while(true){
            System.out.println("Enter Number");
            int totalCount = counter++;

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int number = scanner.nextInt();
                sum+= number;
                average = Math.round((double)sum/totalCount);
                scanner.nextLine();
                //System.out.println(number);
            }else {
                break;
            }
            //scanner.nextLine();
        }
        System.out.println("SUM2 = " + sum + " AVG = " +average);
        scanner.close();

    }


    public static void thisIsASample(){
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        while(true){
            System.out.println("Enter Number");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                if(first){
                    first= false;
                    min = number;
                    max = number;
                }
                if(number > max){
                    max=number;
                }
                if (number < min){
                    min = number;
                }
            }else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println(" min = " + min + " max = " + max);
        scanner.close();
    }
}
