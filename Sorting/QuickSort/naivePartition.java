package Sorting.QuickSort;

public class naivePartition {
    static void partition(int[] arr,int l, int h,int p){
        int[] temp=new int[h-l+1];
        int index=0;
        for(int i=l;i<=h;i++){
            if(arr[i]<=arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=l;i<=h;i++){
            if(arr[i]>arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i:temp){
            System.out.print(i+" ");
        }
    }

    //main method
    public static void main(String[] args) {
        int[] arr={3,6,9,8,5,7};
        partition(arr,0,5,5);
    }
}
