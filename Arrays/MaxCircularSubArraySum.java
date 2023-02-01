package Arrays;

public class MaxCircularSubArraySum {

    //Naive approach
    //check for every possible subarray and find the max sum
    //idea is to use two loops inner one should have index=(i+j) %n
    // {4,-2,5,3}
    static int maxCircular(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            int cur_sum=arr[i];
            int cur_max=arr[i];
            for(int j=1;j<arr.length;j++){
                int index=(i+j)%arr.length;
                cur_sum=cur_sum+arr[index];
                cur_max=Math.max(cur_sum,cur_max);
            }
            max=Math.max(cur_max,max);
        }
        return max;
    }

    //Efficient approach
    // find the maxSubArraySum using kadane's
    // Also find minSubArraySum by implementing kadane on inverted array.
    // return max of max and total-min;
    static int kadane(int[] arr){
        int max=arr[0];
        int cur=arr[0];
        for(int i=1;i<arr.length;i++){
            cur=Math.min(cur+arr[i],arr[i]);
            max=Math.min(max,cur);
        }
        return max;
    }

    static int overAllSub(int[] arr){
        int min=kadane(arr);
        if(min<0){
            return min;
        }
        int arr_sum=0;
        for(int i=0;i<arr.length;i++){
            arr_sum+=arr[i];
            arr[i]=-arr[i];
        }
        int over_all_sum= arr_sum + min;
        return Math.max(over_all_sum,min);

    }
    //The above two methods are part of one solution. and their optimization is below in one method.

    static int reverseKadane(int[] arr){
        //corner case
        if(arr.length==1){
            return arr[0];
        }
        //declaring variables
        int curMax=arr[0],curMin=arr[0],
                min=arr[0],max=arr[0];
        int total=0;total+=arr[0];

        for(int i=1;i<arr.length-1;i++){
            //maxSubArraySum
            curMax=Math.max(curMax+arr[i],arr[i]);
            max=Math.max(curMax,max);

            //minSubArraySum
            curMin=Math.min(curMin+arr[i],arr[i]);
            min=Math.min(curMin,min);
            //incrementing total
            total+=arr[i];
        }
        //if All negative then return max.
        if(total==min){
            return max;
        }
        return Math.max(max,total-min);
    }

    public static void main(String[] args) {
        int[] arr={4,-2,5,3};
        System.out.println(overAllSub(arr));
        int[] arr1={4,-2,5,3};
        System.out.println(maxCircular(arr1));
    }



}
