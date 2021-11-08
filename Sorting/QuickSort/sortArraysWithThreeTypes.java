package Sorting.QuickSort;

public class sortArraysWithThreeTypes {
    static void sortThree(int[] arr){
        int l=0,m=0,h=arr.length-1;
        while(m<=h){
            if(arr[m]==0){
                int temp=arr[m];
                arr[m]=arr[l];
                arr[l]=temp;
                m++;
                l++;
            }
            else if(arr[m]==1){
                m++;
            }
            else{
                int temp=arr[h];
                arr[h]=arr[m];
                arr[m]=temp;
                h--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={0,1,1,2,0,1,2,1,2};
        sortThree(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
