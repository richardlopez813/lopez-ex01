package exercise01;

import java.util.Scanner;

public class Solution01 {
    private static final Scanner in = new Scanner(System.in);

    private static void main(String[] args){
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.printf("Hello, %s, nice to meet you", name);

        /*
        1. Input Scanner
        2. prompt user and ask them what their name is
        3. Scan for name
        4. Create formatted print using the result of the input.
         */
    }
}
