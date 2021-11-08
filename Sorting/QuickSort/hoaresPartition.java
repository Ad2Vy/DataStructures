package Sorting.QuickSort;

public class hoaresPartition {
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

    // main method
    public static void main(String[] args) {
        int[] arr={5,3,8,4,2,7,1,10,6};//sorted till index 3 {1,2,3,4,5,6,7,8,10}
        int res=partition(arr,0,7);
        System.out.println(res);
    }

}
