package Searching;

/**
 * @author aditya vyas
 * Binary Search Recursive And Iterative.
 */
public class BinarySearch {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,9,7,8,9,10};
        int num=10;
        int high=arr.length-1,low=0;
     //   System.out.println(search(arr,num));
        System.out.println(searchRecursive(arr,high,low,num)+" found");
    }

    //Binary search iterative. time complexity O(logn) aux space O(1).
    static int search(int[] arr,int num){
        int n=arr.length;
        int high=n-1;
        int low=0;
        int mid=(int)n/2;
        while(low<=high){
            if(arr[mid]==num)
                return mid;
            else if(arr[mid]<num)
                low=mid+1;
            else
                high=mid-1;
            mid=(high+low)/2;
        }
        return -1;
    }


    //binary search RECURSIVE.. time complexity O(logn) aux space O(logn) spotify

    static int searchRecursive(int[] arr,int high,int low,int num){
        int mid=(high+low)/2;
        if(low>high)
            return -1;
        if(num==arr[mid]){
            return mid;
        }
        else if(num>arr[mid]){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
        return searchRecursive(arr,high,low,num);
    }


}













