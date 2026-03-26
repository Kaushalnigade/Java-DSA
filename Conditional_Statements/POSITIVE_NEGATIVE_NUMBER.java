import java.util.Scanner;    //POSITIVE NEGATIVE NUMBER
class day3 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enetr a number :- ");
        int n = sc.nextInt() ;

        if(n<0) {
            System.out.print("Number is NEGATIVE !!!");
        }
        else if(n>0) {  
            System.out.print("Number is POSITIVE !!!");
        }
        else {
            System.out.print("Number is ZERO !!!");
        }

    }
} 