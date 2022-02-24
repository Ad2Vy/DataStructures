package Arrays;

/**
 * @author aditya vyas
 * Concepts related to moving elements in an array are here.
 * 1. Segregating zeros
 * 2. seperating +ve and -ve
 *
 */


public class SegregatingElements {


    //Move Zeros to the end

    /**
     *
     * @param arr
     * loop through arr
     * > if zero swap it with index.
     */
    static void moveZeros(int[] arr){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                index++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    private static void moveZerosMaintainingOrder(int[] arr) {
        int index=0;
        for(int i= 0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                index++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }



    public static void main(String[] args) {
        int[] arr={1,0,9,0,8,0,7};

        //move zeros to the front
//        moveZeros(arr);
//        System.out.println();
        //move zeros to the back
        moveZerosMaintainingOrder(arr);
//        System.out.println();


    }


}
