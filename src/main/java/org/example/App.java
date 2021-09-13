/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println( "What is the first number? " );
        String first = sc.nextLine();

        System.out.println( "What is the second number? " );
        String second = sc.nextLine();

        int one = Integer.parseInt(first);
        int two = Integer.parseInt(second);

        System.out.println( first + " + " + second + " = " + (one + two) + "\n" +
                            first + " - " + second + " = " + (one - two) + "\n" +
                            first + " * " + second + " = " + (one * two) + "\n" +
                            first + " / " + second + " = " + (one / two) + "\n" );

    }
}
