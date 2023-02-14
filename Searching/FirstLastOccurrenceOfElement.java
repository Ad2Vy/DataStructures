package Searching;

public class FirstLastOccurrenceOfElement {

    static int findFirst(int[] arr, int x){

        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x && (mid==0||arr[mid-1]!=x)){
                return mid;
            }
            else if(arr[mid]< x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }


        }
        return -1;
    }

    static int findLast(int[] arr,int x,int low,int high){

        if(low>high)return -1;

        int mid= low+(high-low)/2;

        if(arr[mid]<x){
            return findLast(arr,x,mid+1,high);
        }
        else if(arr[mid]>x){
            return findLast(arr,x,low,mid-1);
        }
        else{
            if(mid==arr.length-1 || arr[mid+1]!=x){
                return mid;
            }
            else{
                return findLast(arr,x,mid+1,high);
            }
        }
    }

    //another problem on the same concept is to count 1s in binary array (sorted)
    static int findOnes(int[] arr){
        int h=arr.length-1;
        int l=0;
        while(l<=h){
            int m= l+(h-l)/2;
            if(arr[m]<1){
                l=m+1;
            }
            else{
                if(m==0 || arr[m-1]!=1){
                    return arr.length - m;
                }
                else{
                    h=m-1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,3,3,3,4,4,4,4,4};
        int[] ones={0,0,0,0,0,1,1,1,1,1};
        System.out.println(findFirst(arr,4));
        System.out.println(findLast(arr,4,0,13));
        System.out.println(findOnes(ones));
    }

}
