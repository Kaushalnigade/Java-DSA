import java.util.*;
class break_key {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number :- ");
            int n = sc.nextInt() ;
            System.out.println(n);
            if(n%2==0) {   
                break;
            }
        }
            while(true);
    }
        
}
    