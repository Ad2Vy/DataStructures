package Arrays;

import java.util.Arrays;

public class SmallestMissingPositiveInteger {
    // Idea is to keep track and update elements in valid range i.e. >0 && <n
    //if  we encounter an element.  set its node i.e. arr[i]-1 to INT_MIN. while storing arr[node]-1 in temp. repeat until we encounter element of invalid range.

    static int smallest(int[] arr,int size){
        for(int i=0;i<size;i++){
            int val=arr[i]-1;
            if(val<0 && val>=size){
                continue;
            }
            while(val>=0 && val<size){
                int temp=arr[val]-1;
                arr[val]=Integer.MIN_VALUE;
                val=temp;
            }
        }

        for(int i=0;i<size;i++){
            if(arr[i]!=Integer.MIN_VALUE)
                return i+1;
        }
        return size+1;
    }

    public static void main(String[] args) {
        int[] arr={-2,-1,0,5,3,1};
        System.out.println(smallest(arr,arr.length));
    }

}
