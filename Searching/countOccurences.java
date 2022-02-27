package Searching;

import java.util.ArrayList;

public class countOccurences {

    static int count(int[] arr,int x){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if( arr[mid] == x){
                int i=mid+1,count=1;
                boolean isSame=true;
                while(isSame && i<arr.length){
                    if(arr[i]==arr[mid]){
                        count++;
                        i++;
                    }
                    else{
                        isSame=false;
                    }
                }
                i=mid-1;
                isSame=true;
                while(isSame && i>=0){
                    if(arr[i]==arr[mid]){
                        count++;
                        i--;
                    }
                    else{
                        isSame=false;
                    }
                }
                return count;
            }
            else if (arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }

    static int countOcc(int[] arr,int x){
        int low=0;int high=arr.length-1;
        int first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if( mid!=0 ){
                if(arr[mid]==x) {
                    if (arr[mid - 1] != arr[mid]) {
                        first = mid;
                        break;
                    }
                    else{
                        high=mid-1;
                    }
                }
                else if(arr[mid]>x){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                first=mid;
                break;
            }
        }
        low=first;
        high=arr.length-1;
        int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid!=arr.length-1){
                if(arr[mid]==x){
                    if(arr[mid+1]!=arr[mid]) {
                        last = mid;
                        break;
                    }
                    else{
                        low=mid+1;
                    }
                }
                else if(arr[mid]>x){
                   high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                last=mid;
                break;
            }
        }

        return last-first+1;
    }



    public static void main(String[] args) {
        int[] arr={10,20,20,20,20,20,30,30};
        System.out.println(countOcc(arr,10));


    }

}
