package Sorting.QuickSort;

/**
 * Naive:
 * Sort the given array using inbulit sort function and then return k-1 th element.
 * Efficient way is QuickSelect algorithm.(LomutoPartition).
 */
public class kthSmallestElement {
    static int kthElement(int[] arr,int k){
        int l=0;int h=arr.length-1;
        while(l<=h){
            int p=lomutoPartition.partition(arr,l,h,h);
            if(p== k-1){
                return p;
            }
            else if(p>k-1){
                h=p-1;
            }
            else{
                l=p+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]  arr={10,5,30,12};
        int k=5;
        if(kthElement(arr,k)!=(-1))
            System.out.println(arr[kthElement(arr,k)]);
        else
            System.out.println("No "+(k)+" th element");
    }
}
