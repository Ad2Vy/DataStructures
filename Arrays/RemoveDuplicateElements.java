package Arrays;

public class RemoveDuplicateElements {
    public static void removeDuplicate(int[] arr){
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[res-1]!=arr[i]){
                arr[res]=arr[i];
                res++;
            }
        }
        for(int i=0;i<res;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr= {10,20,20,30,30,30,40,40,50};
        removeDuplicate(arr);
    }

}
