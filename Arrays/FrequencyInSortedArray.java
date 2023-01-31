package Arrays;

// using two loops for the same iterator can be useful

public class FrequencyInSortedArray {
    static void freq(int[] arr){
        int freq=1,i=1;
        while(i<arr.length){
            while(i< arr.length && arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" : "+freq);
            i++;
            freq=1;
        }

    }

    static void frequency(int[] arr){
        int freq=1;
        for(int i=1;i<arr.length;i++){

            if(arr[i]==arr[i-1]){
                freq++;
            }
            else{
                System.out.println("freq of "+arr[i-1]+" is "+freq);freq=1;
            }
        }
        System.out.println("freq of "+arr[arr.length-1]+" is "+freq);
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,3,3,3,4,4,4,4,4,4};
//        freq(arr);
        frequency(arr);
    }
}
