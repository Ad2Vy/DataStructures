package Arrays;

public class WindowSliding {

    //Maximum Sum of K Consecutive elements
    static int maxSum(int[] arr,int k){
        int cur_sum=0,max_sum=0;
        for(int i=0;i<k;i++){
            cur_sum+=arr[i];
        }
        for(int i=k;i<arr.length;i++){
            cur_sum+= (arr[i] - arr[i-k]);
            max_sum=Math.max(max_sum,cur_sum);
        }
        return max_sum;
    }
    //SubArray with given sum
    static boolean subSum(int[] arr, int sum){
        int cur_sum=0;

        int s=0;
        for(int i=0;i<arr.length;i++){
            if(cur_sum==sum){
                return true;
            }
            cur_sum+=arr[i];
            while(cur_sum>sum && s<i-1){
                cur_sum-=arr[s];s++;
            }
        }
        return cur_sum==sum;

    }



    public static void main(String[] args) {
        int[] arr={1,8,30,5,20,7};
        //Maximum sum of k consecutive elements
        System.out.println(maxSum(arr,3));
        //SubArray with given sum exists or not
        System.out.println(subSum(arr,6));
    }
}
