package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner Wr = new Scanner(System.in);
        System.out.println("Hello User, Welcome to my first program in Java");
        System.out.print("So, please write two numbers and operator to calculate the result(ex. 4 + 5");
        String Nuber1 = Wr.next();
        Integer Number1 = Integer.parseInt(Nuber1);
        String operatorCalk = Wr.next();
        String Nuber2 = Wr.next();
        Integer Number2 = Integer.parseInt(Nuber2);
        Integer results = 0;
        Double results1 = Double.valueOf(0);
        System.out.println("You enter Number 1: " + Number1);
        System.out.println("You enter Number 2: " + Nuber2);
        System.out.println("You enter operator: " + operatorCalk);
        switch (operatorCalk)
        {
            case "+": {
                results = Number1 + Number2;
                System.out.println("Your result: " + results);
                break;
            }
            case "-": {
                results = Number1 - Number2;
                System.out.println("Your result: " + results);
                break;
            }
            case "*": {
                results = Number1 * Number2;
                System.out.println("Your result: " + results);
                break;
            }
            case "/": {
                Double Number1D = (double)Number1;
                if(Number2 == 0){
                    System.out.print("I can't divide by 0 GoodBye!");
                    System.exit(0);
                }
                results1 = Number1D / Number2;
                System.out.println("Your result: " + results1);
                break;
            }
            default:
            {
                System.out.println("Hmmmm, I don't search a correct operator, GoodBye!");
            }
        }



    }
}
