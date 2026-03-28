import java.util.Scanner ;    // IF, ELSE, ELSE IF
class if_else_elseif{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First number :- ");
        int a= sc.nextInt();
        
        System.out.print("Enter Second Number :- ");
        int b = sc.nextInt();

        System.out.print("Enter Third Number :- ");
        int c = sc.nextInt();

        if(a>b && a>c) {
            System.out.println("First Number " + a + " is Greater");
        }
        else if(b>a & b>c) {
            System.out.println("Second number " + b + " is Greater");
        }
        else {
            System.out.println("Third Number " + c + " is Greater");
        }


    }
} 