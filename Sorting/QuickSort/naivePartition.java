package Sorting.QuickSort;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class naivePartition {

    static void naivePart(int[] arr,int l, int h , int p){
       int[] aux=new int[h-l+1];
        int index=0;
        for(int i=l;i<=h;i++){
            if(arr[i]<arr[p]){
                aux[index++]=arr[i];
            }
        }
        for(int i=l;i<=h;i++){
            if(arr[i]==arr[p]){
                aux[index++]=arr[p];
            }
        }
        int res=l+index-1;
        for(int i=l;i<=h;i++){
            if(arr[i]>arr[p]){
                aux[index++]=arr[i];

            }
        }
        for (int j : aux) {
            System.out.print(j + " ");
        }

    }
    //main method
    public static void main(String[] args) {
        int[] arr={3,6,9,9,8,5,7};
//        naivePart(arr,0,6,3);






    }
}
