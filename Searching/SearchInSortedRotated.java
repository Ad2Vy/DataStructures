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


    static int searchInRotated(int[] arr,int x){
        int low=0,high=arr.length-1;
        // {5,1,2,3,4}
        while(low<=high){
            int mid=low+(high-low)/2;
//            if(arr[low]>x){
//                if(arr[mid]==x){
//                    return mid;
//                }
//                else{
//                    low = mid + 1;
//                }
//            }

            if(arr[mid]==x){
                return mid;
            }
            else if( arr[mid] > x ){
                if(arr[low]>x) {
                    low = mid + 1;
                }
                else{
                    high=mid-1;
                }
            }
            else{
                if(arr[high]<x){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }


        }
        return -1;

    }

    public static void main(String[] args) {

        int[] arr={15,20,25,30,5,10};
//        System.out.println(search(arr,30));

        int[] rotated={4,5,6,7,8,1,2,3};
        System.out.println(searchInRotated(rotated,2));
    }
}
