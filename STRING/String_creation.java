import java.util.*;
public class String_creation {

    public static void printString(String str) {
        for(int i = 0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {

        //STRINGS ARE IMMUTABLE = (don't change) 

        // char arr[] = {'a', 'b', 'c', 'd', 'e'};     
        // String str = "abcd";
        // String str1 = new String("xyz");
        
        // //System.out.println(arr);

        Scanner sc = new Scanner(System.in);
        String firstname = "Kaushal";
        String lastname = "Nigade";

        String fullname = firstname+" "+lastname;
        // name = sc.nextLine();
        // System.out.println(name);

        printString(fullname);
    }
}