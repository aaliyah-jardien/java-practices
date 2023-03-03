package conditionals;

import java.util.Scanner;

class colors {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        // getting color input 
        String color = input.nextLine();
        switch (color){
            case "red":
            System.out.println(1);
            break;
            case "green":
            System.out.println(2);
            break;
            case "black":
            System.out.println(3);
            }
        }
    }
