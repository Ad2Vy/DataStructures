package Arrays;

public class MinimumSizedSubArrayWIthGivenSum {
    static int minSubArray(int[] arr,int target){
        int left=0,right=0;
        int max=Integer.MAX_VALUE;
        int sum=0;
        while(left<arr.length && right<arr.length){
            if(sum==target){
                max=Math.min(right-left,max);
                sum+=arr[right++];
            }
            else if(sum>target){
                sum-=arr[left++];
            }
            else{
                sum+=arr[right++];
            }
        }


        return max;
    }

    public static void main(String[] args) {
        int[] arr={2,3};
        System.out.println(minSubArray(arr,5));
    }

}
