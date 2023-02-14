package Arrays;

public class RearrangeArray {
    static void rearrange(int[] arr,int n){

        for(int i=0;i<n;i++){
            int index=i;
            if(arr[index]==index){
                continue;
            }
            while(arr[index]!=index){
                int temp=arr[index];
                arr[index]=index;
                index=temp;
            }

        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr={0,4,3,1,2,5};
        rearrange(arr,arr.length);
    }

}
