package Arrays;

public class ArrayRotation {
    /*
    Left rotation means moving elements to left i.e. from start to end of an array.
    {1,2,3,4,5} ----> by 2 : {3,4,5,1,2}
     */
    public static void leftRotate(int[] arr,int d){
//        naive method:  shift all the elements by d (here 1) times.
//        int first=arr[0];
//        for(int i=1;i<arr.length;i++){
//            arr[i-1]=arr[i];
//        }
//        arr[arr.length-1]=first;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);

    }


    //Reverse function to reverse elements of Array
    public static void reverse(int[] arr,int l,int h){
        if(l>h)return;
        while(l<h){
            int temp=arr[h];
            arr[h]=arr[l];
            arr[l]=temp;
            l++;
            h--;
        }
    }

    public static void rightRotate(int[] arr, int d){
        //for right rotate we can simply use left array with d = n-d(of right shift);
        leftRotate(arr,arr.length-d);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        rightRotate(arr,2);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
