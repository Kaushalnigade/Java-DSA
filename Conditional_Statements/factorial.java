import java.util.*;
class factorial {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a nuumber to find the Factorail :- ");
        int n = sc.nextInt();

        long factorial = 1;
        if(n<0) {
            System.out.println("Entered number is negative , So enable to find the Factorail !!! ");
        }
        else {
            for(int i=1; i<=n ; i++) {
                factorial*=i;
            }
            System.out.println("factorial of " + n + " is :- " + factorial );
        }
        
    }
}