package Matrix;

import java.util.Collections;

/**
 * A naive solution to this problem would be to make an auxiliary matrix of size m n
 * and update the value in that matrix.
 *
 * Efficient solution:
 * Swap the arr[i][j] with the arr[j][i]
 * for(int i=0;i < arr.length;i++){
 *     for(int j=i+1; j< arr[i].length;j++){
 *         Swap(arr[i][j],arr[j][i]);
 *     }
 * }
 */
public class transposeOfMatrix {
    static void transpose(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        transpose(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
