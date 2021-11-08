package Sorting;

import java.util.Arrays;

/**
 * problem statement says that choclates from arr are to be distributed among m children such that difference betweeen the max alloted
 * choclates and the min alloted choclates is minimum.
 *
 * approach:
 * check if m is greater than n if yes return -1
 * sort() the array.
 * find the min difference between arr[i] and arr[m+i-1]
 * return min
 */
public class choclateDistributionProblem {
    static int minDiff(int[] arr,int m){
        if(m>arr.length-1)return -1;
        Arrays.sort(arr);
        int res=arr[m-1]-arr[0];
        for(int i=0; i+m-1<arr.length;i++){
            res=Math.min(res,(arr[m+i-1]-arr[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={7,3,2,4,9,12,56};
        System.out.println(minDiff(arr,3));
    }
}
