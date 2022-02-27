package Searching;

public class SearchInSortedRotated {
    //Naive solution would to do a simple linear search

    //efficient solution with binary search
    static int search(int[] arr,int x){
        int low=0;int high=arr.length-1;
        while( low <= high){
            int mid=low+(high-low)/2;

            if( arr[mid] == x){
                return arr[mid];
            }
            else if(arr[mid]>arr[low]){
                if(arr[low]<=x && arr[mid]>x){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[high]>=x && arr[mid]<x){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }

        }

        return -1;

    }

    public static void main(String[] args) {

        int[] arr={15,20,25,30,5,10};
        System.out.println(search(arr,30));
    }
}
