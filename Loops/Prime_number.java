import java.util.*;
class Prime_number {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();

        if(n==2) {
            System.out.print(n + " is a prime Number !!!!");
        } else {
            boolean Isprime = true ;
            for(int i=2 ; i<n-1; i++) {
                if(n % i == 0) { //n is multiple of i (i not equal to 1 or n )
                    Isprime = false ;
                }
            }
            if(Isprime == true ) {
                System.out.println(n + " is a prime !!!!");
            } else {
                System.out.println(n + " is not a prime !!!!");
            }

        }
    }
}