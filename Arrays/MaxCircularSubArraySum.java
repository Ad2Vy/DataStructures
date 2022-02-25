package Arrays;

public class MaxCircularSubArraySum {

    //Naive approach
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
    // find the minimum sub array sum and subtract it from array sum to get max circular sub array sum
    static int normalSub(int[] arr){
        int max=arr[0];
        int cur=arr[0];
        for(int i=1;i<arr.length;i++){
            cur=Math.max(cur+arr[i],arr[i]);
            max=Math.max(max,cur);
        }
        return max;
    }

    static int overAllSub(int[] arr){
        int normal_sum=normalSub(arr);
        if(normal_sum<0){
            return normal_sum;
        }
        int arr_sum=0;
        for(int i=0;i<arr.length;i++){
            arr_sum+=arr[i];
            arr[i]=-arr[i];
        }
        int over_all_sum= arr_sum + normalSub(arr);
        return Math.max(over_all_sum,normal_sum);

    }

    public static void main(String[] args) {
        int[] arr={4,-2,5,3};
        System.out.println(overAllSub(arr));
        int[] arr1={4,-2,5,3};
        System.out.println(maxCircular(arr1));
    }



}
