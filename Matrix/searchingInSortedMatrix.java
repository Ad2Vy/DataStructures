package Matrix;

/**
 * Searching element in row and column sorted matrix
 * Naive:
 * traverse through every element and return the index if found
 * Efficient:
 * begin from the upper right corner and check if the element is greater or smaller
 * if greater then move down in the matrix
 * if smaller then move left in the matrix
 * when both conditions matches but can't find the element return -1
 */
public class searchingInSortedMatrix {
    static void findElement(int[][] arr,int x){
        int i=0, j=arr[0].length-1;
        while( i<arr.length && j>=0){
            int element=arr[i][j];
            if(element==x) {
                System.out.println(i + " " + j);
                return;
            }
            else if(element > x){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("not found");

    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        findElement(matrix,11);
    }
}
