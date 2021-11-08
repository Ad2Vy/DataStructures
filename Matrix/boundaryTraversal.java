package Matrix;

public class boundaryTraversal {
    static void getBoundary(int[][] arr){
        if(arr.length==1){
            for(int i=0;i<arr[0].length;i++){
                System.out.print(arr[0][i]+" ");
            }
        }
        else if(arr[0].length==1){
            for (int[] ints : arr) System.out.print(ints[0] + " ");
        }
        else {
            for (int i = 0; i < arr[0].length; i++) {
                System.out.print(arr[0][i] + " ");
            }
            System.out.println();
            for (int i = 1; i < arr.length - 1; i++) {
                System.out.print(arr[i][arr[i].length - 1] + " ");
            }
            System.out.println();
            for (int i = arr[arr.length - 1].length - 1; i >= 0; i--) {
                System.out.print(arr[arr.length - 1][i] + " ");
            }
            System.out.println();
            for (int i = arr.length - 2; i > 0; i--) {
                System.out.print(arr[i][0] + " ");
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        getBoundary(arr);
    }
}
