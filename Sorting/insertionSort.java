package Sorting;

/**
 * @author Aditye Vyas
 * run a loop for element key
 * check if it has any element prior to it greater than key
 * if their then shift the array to the right and fill in the empty space with key.
 */
public class insertionSort {

    public static int[] insSort(int[] arr){
        for(int i=1; i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={50,21,4,15,6,3,25,9};
        int[] a=insSort(arr);
        for(int i:a){
            System.out.print(i+" ");
        }
    }


}
