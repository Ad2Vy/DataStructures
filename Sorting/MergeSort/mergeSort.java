package Sorting.MergeSort;
/**
 * @author aditya vyas
 * Merge Sort
 */
public class mergeSort {
    static void mergeS(int[] arr,int l, int r){
        if(l<r){
            int m=l+(r-l)/2;
            mergeS(arr,l,m);
            mergeS(arr,m+1,r);
            mergeFunction(arr,l,m,r);
        }
    }
    //Merge Function of mergeSort.
    private static void mergeFunction(int[] arr, int l, int m, int h) {
        int n1=m-l+1, n2=h-m;
        int[] left=new int[n1];int[]right=new int[n2];
        for(int i=0;i<n1;i++){ left[i]=arr[i+l];}//inputting in aux array
        for(int j=0;j<n2;j++){ right[j]=arr[m+1+j];}//inputting in aux array
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];

    }

    // main method
    public static void main(String[] args) {
        int[] a={10,5,30,15,7};
        int l=0,r=4;
        for(int i:a){
            System.out.print(i+" ");
        }
        mergeS(a,l,r);
        System.out.println("\nAfter MergeSort:");
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
