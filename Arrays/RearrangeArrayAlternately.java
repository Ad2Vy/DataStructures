package Arrays;

public class RearrangeArrayAlternately {
    static void rearrange(int[] arr,int n){

        int max=arr[n-1]+1;
        int minIndex=0,maxIndex=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]+= (arr[maxIndex]%max)*max;
                maxIndex--;
            }
            else{
                arr[i]+= (arr[minIndex]%max)*max;
                minIndex++;
            }
        }
        for(int i:arr){
            i=i/max;
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11};
        rearrange(arr,arr.length);
    }

}
