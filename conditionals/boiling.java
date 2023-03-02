import java.util.Scanner;

class Boiling {
    public static void main(String[] arg) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        
        if (temp>= 100){
            System.out.println("Boiling");
        } else {
            System.out.println("Not boiling");
            }
        }
    }

// You are making a program for a water sensor that should check if the water is boiling.
// Take the integer temperature in Celsius as input and output "Boiling" if the temperature is above or equal to 100.
// Output "Not boiling" if it's not.
// Sample Input 105
// Sample Output Boiling