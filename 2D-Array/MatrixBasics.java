import java.util.*;
public class MatrixBasics {

    public static boolean search(int matrix[][], int key) {
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == key ) {
                    System.out.println("Found at cell (" + i + "," + j +")");
                    return true;
                }
            }
        }
        return false ;
    }   

    public static void print_matrix(int[][] matrix) {
        for(int [] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String args[]) {
        int matrix[][] = new int [3][3];
        // int n = 3 , m = 3; OR
        int n = matrix.length , m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        print_matrix(matrix);
        search(matrix, 5);

        //            OUTPUT
        //----------- 1.WAY ----------
        // for(int i = 0; i<n; i++) {
        //     for(int j = 0; j<m; j++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        //---------- 2. WAY -----------
        // System.out.println(Arrays.deepToString(matrix));

    }
}