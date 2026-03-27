import java.util.*;
class temperature {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the body temprature :- ");
        double temp = sc.nextDouble();

        if(temp >= 100) {
            System.out.println("You Have a fever !!!!!!");
        }
        else {
            System.out.println("Your don't have a Fine !!!!!!");
        }
    
    }
}