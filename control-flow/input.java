/*
to get an input from the user
there are various ways to take input in java
 */


// you must import the corresponding class
// always import before declaring the class
// this imports scanner class for taking input
import java.util.Scanner;


class Dinput {
    public static void main(String[] arg){
        // create a scanner object
        // (in for it's an input & when i print i say out cos it's an output)
        Scanner inpu = new Scanner(System.in);
        // taking a string input
        String nick = inpu.nextLine();
        // taking an integer input
        int age = inpu.nextInt();
        System.out.println(nick);
        System.out.println(age);
    }
}

// There are similar methods available to take other types as input: nextDouble(), nextFloat(), nextBoolean().