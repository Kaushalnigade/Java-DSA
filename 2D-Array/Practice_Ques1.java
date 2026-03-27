import java.util.*;
public class Practice_Ques1 {
    public static int sum (int matrix[][]) {
        int carry = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(matrix[i][j] == 7) {
                    carry ++;
                }
            }
        }
        return carry;
    }
    public static void main(String[] args) {
        int matrix [][] = {
            {7, 8, 8},
            {4, 7, 8}
        };
        System.out.println("Matrix is: " + sum(matrix));
    }
}