/*
 * fill in th eblacnks to create a valid program that takes a string and an
 * integer as input, then outputs a welcome message
 */

// import scanner
import java.util.Scanner;


class Welcome {
    public static void main(String[] arg){
        // create static object
        Scanner ssk = new Scanner(System.in);
        // var for name input
        String name = ssk.nextLine();
        // var for age input
        int age = ssk.nextInt();
        // printing output
        System.out.println("Welcome: "+name);
        System.out.println("Age: "+age);
    }
}
