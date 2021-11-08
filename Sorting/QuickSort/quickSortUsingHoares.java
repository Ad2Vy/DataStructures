package Sorting.QuickSort;
/**
 * @author aditya vyas
 * quick sort with hoares partition
 */
public class quickSortUsingHoares {

    static void qSort(int[] arr,int l,int h){
        if(l<h){
            int p=partition(arr,l,h);
            qSort(arr,l,p);
            qSort(arr,p+1,h);
        }
    }
    static int partition(int[] arr,int l,int h){
        int pivot= arr[l];
        int i=l-1;
        int j=h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);

            if(i>=j){
                return j;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
    }

    public static void main(String[] args) {
        int[] arr={8,4,7,9,3,10,5};
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\nAfter quickSort:");
        qSort(arr,0,6);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
