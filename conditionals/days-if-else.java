package conditionals;

import java.util.Scanner;

class DaysIf{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        if (day==1){
            System.out.println("Monday");
        } else if (day==2){
            System.out.println("Tuesday");
        } else if (day==3){
            System.out.println("Wednesday");
        } else if (day==4){
            System.out.println("Thursday");
        } else if (day==5){
            System.out.println("Friday");
        } else if (day==6){
            System.out.println("Saturday");
        } else if (day==7){
            System.out.println("Sunday");
        }
    }
}

// this uses just if and else if statements
// now to try with switch statements

class DaysSwitch{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
            System.out.println("Another day");      
        }
    }
}
// break is here so that it doesn't print the rest of the cases
// cos without break it printed the following statements