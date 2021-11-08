package Sorting.MergeSort;
import Sorting.insertionSort;

/**
 *  1. NAIVE SOLUTION
 * One Naive solution could be to create an auxiliary array of size (m+n) and put all the elements in it.
 * Now sort this array using inbuilt Sort() function.
 *
 *
 *
 */
public class mergeTwoSortedArrays {

    public static void naiveMerge(int[] a,int[] b){
        int[] arr = new int[(a.length+b.length)];

        //putting all elements of a[] in arr[]
        for(int i=0;i<a.length;i++){
            arr[i]=a[i];
        }
        // putting all elements of b[] in arr[]
        for(int j=0;j<b.length;j++){
            arr[a.length+j]=b[j];
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
        //Now sort the arr[] array with in built functions or user defined. Let's sort it with insertion Sort.
        System.out.println("\nthis is sorted: ");
        arr=insertionSort.insSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }

    // Efficient merge of two sorted arrays..
    public static void effMerge(int[] a,int[] b){
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                System.out.print(a[i]+" ");
                i++;
            }
            else if(a[i]== b[j]){
                System.out.print(a[i]+" "+b[j]+" ");
                i++;j++;
            }
            else{
                System.out.print(b[j]+" ");
                j++;
            }
        }
        //print the remaining elements of the a[] array if any.
        while(i<a.length){
            System.out.print(a[i]+" ");
            i++;
        }
        //print the remaining elements of the b[] array if any.
        while(j<b.length){
            System.out.print(b[j]+" ");
            j++;
        }
    }

    //Main Method
    public static void main(String[] args) {
        int[] a={10,15,20};
        int[] b={4,6,6,15};
        //naive merge method call
        naiveMerge(a,b);
        //efficient merge method call
        System.out.println("\n-this is efficient merge:");
        effMerge(a,b);
    }

}
