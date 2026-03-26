import java.util.*;
public class Practice3 {

    public static void Transpose(int matrix[][]) {
        for(int i = 0; i<matrix.length; i++) {
            for(int j = i+1; j<matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void print_matrix(int[][] matrix) {
        for(int [] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static void main(String args[]) {
        int matrix[][] = {{1, 4, 9},
                          {11, 4, 3},
                          {2, 2, 3}};

        System.out.println("Original Matrix :- ");
        print_matrix(matrix);

        Transpose(matrix);

        System.out.println("Transposed Matrix :- ");
        print_matrix(matrix);
    }
}