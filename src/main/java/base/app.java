package base;

import java.util.Scanner;

public class app { public static void main(String[] args){



    Scanner in = new Scanner(System.in);

    System.out.print("What is the password?");
    String input0 = in.nextLine();

    if (input0.equals("abc$123"))
    {
        System.out.println("Welcome!");
    }

    else {
        System.out.println("I don't know you.");
    }










}
}
