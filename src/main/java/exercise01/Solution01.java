/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
    1. Input Scanner
    2. prompt user and ask them what their name is
    3. Scan for name
    4. Output statement with name given
 */

package exercise01;

import java.util.Scanner;

public class Solution01 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("What is your name? ");
        String name = in.nextLine();
        String statement = "Hello " + name + " nice to meet you!";
        System.out.print(statement);
    }
}
