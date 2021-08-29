/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;

import java.text.NumberFormat;
import java.util.Scanner;
public class App {
    public static void main( String[] args ) {
       Scanner sc = new Scanner(System.in);
       float principal = Float.parseFloat( strIO("Enter the principal: ",sc));
       float rate = Float.parseFloat( strIO("Enter the rate of interest: ",sc));
       int numYears = Integer.parseInt( strIO("Enter the number of years: ",sc));
       float investmentWorth= (float) ((float)principal * (1.0 + ( (rate/100)*(numYears) ) ));
       NumberFormat cur = NumberFormat.getCurrencyInstance();
       String formattedInvestment= cur.format(investmentWorth);
       System.out.println("After "+ numYears + " years at " + rate + "%, the investment will be worth "+formattedInvestment);

    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
