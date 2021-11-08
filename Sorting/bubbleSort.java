package Sorting;

import java.util.*;

/**
 * compare the elements with the adjacent elements and swap if prior is bigger.
 * 2. for this use to loops one for traversal and other for i+1 to arr.length.
 */

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={2,10,8,7};
        int[] a=bubSort(arr);
        for (int j : a) {
            System.out.print(j + " ");
        }
    }
    public static int[] bubSort(int[] arr){
        for(int i=0;i<arr.length-1; i++){
            boolean swapped = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
}
