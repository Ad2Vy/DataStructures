package Arrays;

public class PrefixSum {
    //Equilibrium point: point in array where sum before it is equal to sum after it.
    // eg. {2,-2,4,3,-3}: 4 is eq point.
    //Naive
    static int naiveEqPoint(int[] arr){
        for(int i=0;i<arr.length;i++){
            int leftSum=0,rightSum=0;
            for(int j=0;j<i;j++){
                leftSum+=arr[j];
            }
            for(int j= arr.length-1;j>i;j--){
                rightSum+=arr[j];
            }
            if(leftSum==rightSum){
                return arr[i];
            }
        }
        return -1;
    }
    //Efficient equilibrium point
    static int effEqPoint(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int lsum=0;
        for(int i=0;i<arr.length;i++){
            if(lsum==sum-arr[i]){
                return arr[i];
            }
            sum-=arr[i];
            lsum+=arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={3,4,8,-9,20,6};
        System.out.println(effEqPoint(arr));
        System.out.println(naiveEqPoint(arr));
    }

}
