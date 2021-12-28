package Arrays;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr={7,10,4,10,6,5,2};
        int leader=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>leader){
                leader= arr[i];
                System.out.print(leader+" ");
            }
        }
    }

}
