// tip calculator
// You always tip 15% of the bill amount. 
// To make the calculation easier, you decide to write a program that will do that for you.
// Task: Take the bill amount as input and output the corresponding tip amount, which should be 15% of the amount.
// To calculate 15% of a number, multiply it by 15, then divide by 100.

// The input amount can be a decimal, so take a double from the input.


// import scanner
import java.util.Scanner;


class calculator {
    public static void main(String[] arg){
        // create object of scanner
        Scanner input = new Scanner(System.in);
        // var for bill amount
        // since you're using the double data type, your input should also be a double
        double amount = input.nextDouble();
        // print tip
        System.out.println((amount*15)/100);
    }
    
}
