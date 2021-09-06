/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner inp = new Scanner(System.in);
        Scanner inp2 = new Scanner(System.in);
        double OrderAmount = 0;
        double taxRate = 0;
        System.out.print("What is the order amount? ");
        OrderAmount = inp.nextInt();
        System.out.print("What is the state? ");
        String state = inp2.nextLine();

        if (state.equals("WI"))
        {
             taxRate = 0.055;
             double totalTax = OrderAmount * taxRate;
             double Total = totalTax + OrderAmount;
             System.out.print("The subtotal is $" + String.format("%.2f", OrderAmount) + ".\n" + "The tax is $" + String.format("%.2f", totalTax) + ".\n" + "The total is $" + String.format("%.2f", Total) + ".");
        }
    }
}
