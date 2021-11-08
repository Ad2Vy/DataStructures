package Recursion;

public class subsetSum {
    static int sum(int[] arr,int n,int sum){
        if(n==0){
            return (sum==0)?1:0;
        }
        return sum(arr,n-1,sum)+sum(arr,n-1,sum-arr[n-1]);
    }

    public static void main(String[] args) {
        int[] arr={10,20,15};
        System.out.println(sum(arr,3,25));
    }
}
