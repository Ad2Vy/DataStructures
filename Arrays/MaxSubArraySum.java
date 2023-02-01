package Arrays;

public class MaxSubArraySum {
    static int maxSum(int[] arr){
        int max=arr[0],curMax=arr[0];
        for(int i=1;i<arr.length;i++){
            curMax=Math.max(curMax+arr[i],arr[i]);
            max=Math.max(curMax,max);
        }
        return max;
    }

    static int longestEvenOdd(int[] arr){
        //Brute force
//        int max=0,count=1;
//        for(int i=0;i<arr.length;i++){
//            int freq=1;
//            for(int j=i+1;j<arr.length;j++){
//                if((arr[j]%2==0&&arr[j-1]%2!=0)  || (arr[j]%2!=0&&arr[j-1]%2==0)){
//                    freq++;
//                }
//                else
//                    break;
//            }
//            max=Math.max(max,freq);
//        }
//        return max;

        //Efficient solution

        int max=1,count=1;
        for(int i=1;i<arr.length;i++){
            if((arr[i]%2==0&&arr[i-1]%2!=0)  || (arr[i]%2!=0&&arr[i-1]%2==0)){
                count++;
                max=Math.max(max,count);
            }
            else
                count=1;


        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={-2,0,-8,-1,-1,2,3};
        System.out.println(maxSum(arr));

//        int[] ar={0,1,2,3,3,4,5,5,6,7,8};
//        System.out.println(longestEvenOdd(ar));

    }
}
