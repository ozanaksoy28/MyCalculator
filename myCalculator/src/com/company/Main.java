package com.company;
import java.util.Scanner;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        float number1;
        float number2;
        int operator;
        Scanner input = new Scanner(System.in);
        Scanner op = new Scanner(System.in);
        System.out.println("First number...");
        number1 = input.nextInt();
        System.out.println("Second number...");
        number2 = input.nextInt();
        System.out.println("Choose operator...");
        System.out.println("1. Addition(+)");
        System.out.println("2. Subtraction(-)");
        System.out.println("3. Multiplication(x)");
        System.out.println("4. Division(/)");
        operator = op.nextInt();
        switch (operator){
            case 1:
            System.out.println("Result is "+ (number1+number2));
                break;
            case 2:
                System.out.println("Result is "+ (number1-number2));
                break;
            case 3:
                System.out.println("Result is "+ (number1*number2));
                break;
            case 4:
                System.out.println("Result is "+ (number1/number2));
                break;
        }
    }

}

