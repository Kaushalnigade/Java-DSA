import java.util.Scanner ;   //ODD EVEN NUMBER 
class ODD_EVEN_NUMBER{
    public static void main(String srgs[]) {
        System.out.print("Enter a Number :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("\n");

        if(n%2 == 0 ) {
            System.out.println("Number Entered is Even !!!!") ;
        }
        else {
            System.out.println("Number Entered is Odd !!!!") ;
        }
    }
}   