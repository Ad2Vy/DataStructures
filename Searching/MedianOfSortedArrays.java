package Searching;

public class MedianOfSortedArrays {

    /**
     * {1,2,3,4}
     * {5,6,7,8}
     *
     * @param arr1 = {3,4,5,6,7}
     * @param arr2 = {1,2,8,9,10}
     *
     * @return
     */
    static double median(int[] arr1,int[] arr2){
        if(arr1.length>arr2.length)return median(arr2,arr1);
        int begin=0,end=arr1.length-1;
        while(begin<=end){
            int i1=(begin+end)/2;
            int i2= (arr1.length+arr2.length-1)/2 -i1;
            int min1=(i1==0)?Integer.MAX_VALUE:arr1[i1];
            int max1=(i1== arr1.length-1)?Integer.MIN_VALUE:arr1[i1-1];
            int min2=(i2==0)?Integer.MAX_VALUE:arr2[i2];
            int max2=(i2== arr2.length-1)?Integer.MIN_VALUE:arr2[i2-1];
            if(min1>max2 && min2>max1){
                if((arr1.length+arr2.length)%2==0){
                    return (Math.max(max1,max2)+Math.min(min1,min2))/2;
                }
                else {
                    return Math.max(max1,max2);
                }
            }
            else if(max1>min2){
                end=i1-1;
            }
            else{
                begin=i1+1;
            }
        }
        return -1;
    }

    //So the basic idea is to have these sorted in one and then the middle or avg. of middle elements is median.

    static int medianOfTwoSortedArrays(int[] A,int[] B){
        int left=0,right=A.length-1;
        while(left<=right){
            int i1=(left+right)/2;
            int i2= (A.length+B.length+1)/2 -i1;

            //getting max and mins.
            // minimum in second halves.
            int min1= (i1==0)?Integer.MIN_VALUE:A[i1];
            int min2= (i2==0)?Integer.MIN_VALUE:B[i2];
            //maximum in first halves.
            int max1= (i1==A.length-1)?Integer.MAX_VALUE:A[i1-1];
            int max2= (i2==B.length-1)?Integer.MAX_VALUE:B[i2-1];

            if(min2>=max1 && min1>=max2){
               if((A.length+B.length)%2==0) {
                    return (Math.max(max1, max2) + Math.min(min1, min2)) / 2;
                }
                else{
                    return Math.max(max1, max2);
                }
            }
            if( max1>min2){
                right=i1-1;
            }
            else{
                left=i1+1;
            }


        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,7,8,9};
        int[] arr2={5,6,10,11,12,13,14};
        // {1,2,3,4,5,6,7,8,9,10,11,12,13,14}

        System.out.println(median(arr1,arr2));


    }

}
