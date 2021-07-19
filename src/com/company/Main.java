package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Please choose a number: ");
        Scanner userInput = new Scanner(System.in);
        int num1 = userInput.nextInt();
        System.out.print("Please choose another number: ");
        int num2 = userInput.nextInt();
        System.out.println("Available operations: ");
        System.out.println("'+' sum both elements");
        System.out.println("'-' do substraction");
        System.out.println("'/' do dividing");
        System.out.println("'*' do multiplication");
        System.out.println("'%' get reminder when the first element is divided by the second element");
        System.out.println("'p' print out both elements");
        System.out.println("'b' verify which element is bigger");
        System.out.println("'s' verify which element is smaller");
        System.out.println();

        System.out.print("Please choose an operation from the list above: ");
        userInput.nextLine();
        char userOption = (char) userInput.nextInt();

        switch (userOption) {
            case '+':
                int sum = num1 + num2;
                System.out.println("The sum of the two numbers is: " + sum);
                break;
            case '-':
                int subs = num1 - num2;
                System.out.println("The result of substracting the two numbers is: " + subs);
                break;
            case '/':
                int div = num1/num2;
                System.out.println("The result of dividing the two numbers is: " + div);
                break;
            case '*':
                int mult = num1 * num2;
                System.out.println("The result of multiplicating the two numbers is: " + mult);
                break;
            case '%':
                int mod = num1 % num2;
                System.out.println("The reminder of the first number when it has been divided by the second number is: " + mod);
                break;
            case 'p':
                System.out.println("The numbers you have chosen are: " + num1 + " and " + num2);
                break;
            case 'b':
                if (num1 > num2) {
                    System.out.println("The first number is bigger than the second one.");
                } else {
                    System.out.println("The second number is bigger than the first one.");
                }
                break;
            case 's':
                if (num1 < num2) {
                    System.out.println("The first number is smaller than the second one.");
                } else {
                    System.out.println("The second number is smaller than the first one.");
                }
                break;
            default:
                System.out.println("you have entered an invalid letter, please try again!");
                break;
        }

    }
}
