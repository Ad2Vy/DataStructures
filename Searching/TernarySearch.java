package Searching;

public class TernarySearch {
    static int ternarySearch(int arr[],int x){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid1= low+ (high-low)/3;
            int mid2= high- (high-low)/3;

            if(arr[mid1]==x)return mid1;
            if(arr[mid2]==x)return mid2;
            if(arr[mid1]>x){
                high=mid1-1;
            }
            else if(arr[mid2]<x){
                low=mid2+1;
            }
            else{
                low=mid1+1;
                high=mid2-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(ternarySearch(arr,15));

    }

}
