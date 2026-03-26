import java.util.*;
class CALCULATOR_char {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enetr first number :- ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number :- ");
        int b = sc.nextInt();


        System.out.print("Enetr Operator :-");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println("Addition :- " + (a+b));
            break;

            case '-' : System.out.println("Substraction :- " + (a-b));
            break;

            case '*' : System.out.println("Multiplication :- " + (a*b));
            break;

            case '/' : System.out.println("Division :- " + (a/b));
            break;

            case '%' : System.out.println("Modulo :- " + (a&b));
            break;

            default : System.out.println("Wrong Opearotor !!!!!");


        }

    }
}