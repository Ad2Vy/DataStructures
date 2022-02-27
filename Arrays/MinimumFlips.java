package Arrays;

public class MinimumFlips {
    static int minimumFlips(int[] arr){
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                if(arr[i]!=arr[0]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={0,1,0,0,1,0,1,1};
        System.out.println(minimumFlips(arr));

    }
}
