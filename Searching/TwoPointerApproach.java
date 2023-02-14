package Searching;

public class TwoPointerApproach {

    static boolean findSum(int[] arr,int sum){
        int i=0,j=arr.length-1;
        while(i<j){
            if( (arr[i]+arr[j]) == sum ){
                return true;
            }
            else if(arr[i]<=arr[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr={10,3,3,4,5,6};
        System.out.println(findSum(arr,7));
    }
}
