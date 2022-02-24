package Arrays;

/**
 *  max value of arr[j] - arr[i] such that j>i.
 *  consider every element as arr[j]
 *  and keep track of minimum element so far
 *  calculate arr[j]- arr[i] and check if its max.
 *  */
public class maxDifference {
    static int difference(int[] arr){
        int minval=arr[0];
        int diff=arr[1]-arr[0];
        for(int i=1;i<arr.length;i++){
            diff=Math.max(diff,arr[i]-minval);
            minval= Math.min(minval,arr[i]);
        }
        return diff;

    }

    public static void main(String[] args) {
        int[] arr={2,3,4,1,4,5};
        System.out.println(difference(arr));
    }
}
