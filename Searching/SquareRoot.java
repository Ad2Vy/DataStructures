package Searching;

public class SquareRoot {
    static int sqaureRoot(int x){
        int low=0;int high=x;
        int val=0;
        while(low<=high){

            int mid=low+(high-low)/2;
            val=mid;
            if(mid*mid==x){

                return mid;
            }
            else if(mid*mid>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return val-1;
    }

    public static void main(String[] args) {
        int x=64;
        System.out.println(sqaureRoot(x));
    }



}
