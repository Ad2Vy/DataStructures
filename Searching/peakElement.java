package Searching;

public class peakElement {
    public static void main(String[] args) {
        int[] arr={5,20,40,30,20,50,60};
        System.out.println(peak(arr));
    }

    private static int peak(int[] arr) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid==0||arr[mid-1]<=arr[mid]) && (mid==n-1||arr[mid]>=arr[mid+1])){
                return arr[mid];
            }
            if(mid!=0 && arr[mid-1]>=arr[mid]){
                high = mid -1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
