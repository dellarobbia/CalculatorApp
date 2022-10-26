package com.dellarobbia;

import java.util.Scanner;

import com.dellarobbia.Calculators.Adder;

public class Main{
    public static void main(String[] args){
        boolean done = false;
        do {
            done = mainMenu();
        } while(!done);
    }

    static boolean mainMenu(){
        int selection = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an option:");
        System.out.println("0: Exit");
        System.out.println("1: Add Numbers");
        selection = scanner.nextInt();
        
        switch(selection){
            case 0:
                return true;
            case 1:
                addNumbersMenu();
                return false;
            default:
                System.out.println("Invalid Selection");
                return false;
        }
    }

    static void addNumbersMenu(){
        float number1;
        float number2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        number1 = scanner.nextFloat();

        System.out.println("Enter another number:");
        number2 = scanner.nextFloat();
        
        float[] numbers = {number1, number2};
        Adder adder = new Adder(numbers);

        adder.calculate();

        System.out.println(adder.getResult());
    }
}