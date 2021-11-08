package Sorting.QuickSort;

public class quickSortUsingLomuto {
    static void qSort(int[] arr,int l, int h){
        if(l<h){
            int p=lomutoPartition.partition(arr,l,h,h);
            qSort(arr,l,p-1);
            qSort(arr,p+1,h);
        }
    }
    //main
    public static void main(String[] args) {
        int[] arr={8,4,7,9,3,10,5};
        qSort(arr,0,6);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
