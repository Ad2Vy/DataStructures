package Matrix;
/**
 * naive:
 * we can create a temp arr and copy eleents as per the requirement
 * efficient:
 *  Best way is to transpose a matrix and print it from bottom to top.
 */

public class rotateMatrix {
    static void rotate(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(matrix);
    }
}
