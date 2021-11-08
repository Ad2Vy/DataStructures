package Sorting;

/**
 * 1. Swap the minimum element in the remaining array at i.
 */
public class selectionSort {

    public static int[] selectSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={64,25,12,22,11};
        int[] arr1=selectSort(arr);
        for (int j : arr1) {
            System.out.print(j + " ");
        }
    }
}
