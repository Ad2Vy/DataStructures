package Arrays;

public class MaximumOnes {

    static int maxOnes(int[] arr){
        int max=0;
        int freq=1;
        for(int i=1;i<arr.length;i++){
//            if(arr[i]==1 && arr[i-1]==1){
//                freq++;
//            }
//            else{
//                max=Math.max(max,freq);
//                freq=1;
//            }
            if(arr[i]==0){
                freq=0;
            }
            else{
                freq++;
                max=Math.max(max,freq);
            }
        }
//        max=Math.max(freq,max);
        return max;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,0,1,0,1,1,1,0,1,1,1,1,1,0};
        System.out.println(maxOnes(arr));
    }
}
