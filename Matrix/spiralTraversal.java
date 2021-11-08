package Matrix;

/**
 *
 * define 4 variables top bottom left right and on each traversal increment or decrement as per the requirements
 * while(top>=bottom && left >= right)
 */
public class spiralTraversal {
    static void spiral(int[][] arr){
        int left=0,right=arr.length-1,top=0,bottom=arr.length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {

                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        spiral(matrix);
    }
}
