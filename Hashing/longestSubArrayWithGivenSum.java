package Hashing;

import java.util.HashMap;

public class longestSubArrayWithGivenSum {
    static int getLongest(int[] arr,int sum){
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        int pre_sum=0;
        int res=0;
        for(int i=0;i<arr.length;i++){
            pre_sum+=arr[i];
            if(pre_sum==sum){
                res=i+1;
            }
            if(m.containsKey(pre_sum)==false)
                m.put(pre_sum,i);
            if(m.containsKey(pre_sum-sum)) {
                res = Math.max(i - m.get(pre_sum - sum), res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,4,4,3,2,1};
        System.out.println(getLongest(arr,10));
    }
}
