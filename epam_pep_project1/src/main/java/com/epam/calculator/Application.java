package com.epam.calculator;

import com.epam.calculator.math.Calculator;

import java.util.Scanner;

public class Application{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Number 1:");
        double number1 = scan.nextDouble();

        System.out.println("Number 2:");
        double number2 = scan.nextDouble();

        System.out.println("Choose operation( + | - | * | / ):");
        String operator = scan.next();

        switch(operator){
            case "+" :
                double addition = Calculator.add(number1, number2);
                System.out.println(addition);
                break;
            case "-" :
                double subtraction = Calculator.subtract(number1, number2);
                System.out.println(subtraction);
                break;
            case "*" :
                double multiplication = Calculator.multiply(number1, number2);
                System.out.println(multiplication);
                break;
            case "/" :
                double division = Calculator.divide(number1, number2);
                System.out.println(division);
                break;
            default:
                System.out.println("Please Enter the correct operation!!");
        }
    }
}
