import java.util.*;
public class String1 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);

            System.out.println(ch + " " + "variable no. is " + sb.length());

        }
    }
}