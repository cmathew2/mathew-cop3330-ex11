/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package base;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("How many euros are you exchanging? ");
        String euro = in.nextLine();
        System.out.print("What is the exchange rate? ");
        String rate = in.nextLine();

        //string conversion
        double e = Double.parseDouble(euro);
        double x = Double.parseDouble(rate);

        //round up conversion
        double usd = Math.round((e * x) * 100.0) / 100.0;

        //output
        System.out.println(euro + " euros at an exchange rate of " + rate + " is\n" + usd + " U.S. dollars.");

    }
}
