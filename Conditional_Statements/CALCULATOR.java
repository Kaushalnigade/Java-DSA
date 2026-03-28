import java.util.*;
class CALCULATOR {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        System.out.print("Enetr first Number :- ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number :- ");
        int b = sc.nextInt();

        System.out.println("1: Addition \n 2: Substrction \n 3: Multiplication \n 4: Division \n 5: Exit!!!! ");

        System.out.print("Enter Your choice :- ");
        int operator = sc.nextInt();

        switch(operator){
            case(1) : System.out.println("Addition is :- " + (a+b) );
            break;
        
            case(2) : System.out.println("Substraction is :- " + (a-b) );
            break;

            case(3) : System.out.println("Multiplication is :- " + (a*b) );
            break;

            case(4) : System.out.println("Division is :- " + (a/b) );
            break;

            case(5) : System.out.println("Exit !!!");
            break;

            default: System.out.println("Invalid Choice");
            break;
            }
        }
        
    }
}
    