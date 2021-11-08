package Sorting.MergeSort;

import java.util.Arrays;

public class mergeFunctionOfMergeSort {
    static int[] merge(int[] a, int low, int mid, int high) {
        int n = mid - low + 1, m = high - mid;
        int[] left = new int[n];
        int[] right = new int[m];
        //putting elements in aux array left and right
        for (int i = 0; i < n; i++) {
            left[i] = a[low + i];
        }
        for (int j = 0; j < m; j++) {
            right[j]=a[mid+j+1];//here's where i made mistake last time..
        }

        //standard merge function for two sorted arrays
        int i=0,j=0,k=low;
        while(i<n && j<m){
            if(left[i]<=right[j]){
                a[k]=left[i];
                i++;
                k++;
            }
            else{
                a[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<n){
            a[k]=left[i];
            i++;
            k++;
        }
        while(j<m){
            a[k]=right[j];
            j++;
            k++;
        }
        return a;

    }

    //main method
    public static void main(String[] args) {
        int[] arr={10,15,20,40,8,11,55};
        int low=0,mid=3,high=6;
        int[] ar=merge(arr,low,mid,high);
        for(int i:ar){
            System.out.print(i+" ");
        }
    }

}