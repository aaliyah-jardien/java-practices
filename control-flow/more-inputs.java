// import scanner
import java.util.Scanner;

// multiple inputs
// use the same scanner to take multiple inputs
class Minput {
    public static void main(String[] args){
        // create scanner object
        Scanner inpu = new Scanner(System.in);
        // name var input
        String name = inpu.nextLine();
        // age var input
        int age = inpu.nextInt();
        // printing both vars
        System.out.println(name+" "+age);
    }
}
