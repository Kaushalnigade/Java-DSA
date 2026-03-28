import java.util.*;
class input_reverse_no {
    public static void main(String args[]) {
        
        System.out.print("Enter the number to Reverse :- ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();  // Reads a single word (stops at space)
        String fullLine = sc.nextLine();  // Reads the entire line (including spaces)


        while( n > 0 ) {
            string lastdigit = n % 10 ;
            System.out.print(lastdigit + " ");
            n = n/10;
        }
        System.out.println(" ");
    }
}