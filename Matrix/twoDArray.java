package Matrix;
//JAGGED Array of user specified size

public class twoDArray {
    public static void main(String[] args){
        int[][] arr=new int[5][];
        for(int i=0;i<5;i++){
            arr[i]=new int[i+1];
            for(int j=0;j<i+1;j++){
                arr[i][j]=i;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
