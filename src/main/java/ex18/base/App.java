package ex18.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n" +
                "Your choice: ");

        String choice = input.nextLine().toLowerCase();

        StringBuilder output = new StringBuilder();

        if("c".equalsIgnoreCase(choice)){

            System.out.print("Please enter the temperature in Fahrenheit: ");
            int temp = input.nextInt();
            int C = (temp - 32) * 5 / 9;
            output.append(String.format("The temperature in C is %d.", C));

        }else if("f".equalsIgnoreCase(choice)){

            System.out.print("Please enter the temperature in Celsius: ");
            int temp = input.nextInt();
            int F = (temp * 9 / 5) + 32;
            output.append(String.format("The temperature in F is %d.", F));

        }
        System.out.println(output);

    }
}
