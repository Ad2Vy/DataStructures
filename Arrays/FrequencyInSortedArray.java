package Arrays;

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

    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,3,3,3,4,4,4,4,4,4};
        freq(arr);

    }
}
