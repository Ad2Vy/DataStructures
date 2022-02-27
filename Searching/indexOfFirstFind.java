package Searching;

public class indexOfFirstFind {
    public static void main(String[] args){
        int[] arr={2,4,5,5,5,6,6,6,8,8,8,9};
        int num=6;
        System.out.println(firstIndex(arr,num));
        System.out.println(lastIndex(arr,num));
    }

    static int firstIndex(int[] arr,int num){
        int low=0;
        int high = arr.length - 1;
        while(low<=high) {
            int mid = (low + high) / 2;
            if (arr[mid] == num) {
                if (mid!=0&& arr[mid - 1] == num) {
                    high = mid - 1;
                }
                else
                    return mid;
            }
            else if(arr[mid]>num){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    static int lastIndex(int[] arr,int num){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==num){
                if(mid!=(arr.length-1)&&arr[mid+1]==num){
                    low=mid+1;
                }
                else
                    return mid;
            }
            else if(arr[mid]<num){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }


}
