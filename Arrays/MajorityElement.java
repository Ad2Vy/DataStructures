package Arrays;

public class MajorityElement {
    //Element whose freq is more then half of the total elements
    static int majorityElement(int[] arr){

        int index=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            int freq=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    freq++;
                }
            }
            if(freq>arr.length/2)return i;
        }
        return -1;

    }

    //Efficient : Moore's Voting Algorithm.
    static int mooreVoting(int[] arr){
        int count=1,res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[res]==arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                count=1;
                res=i;
            }
        }
        int freq=0;
        for(int i=0;i<arr.length;i++){
            if(arr[res]==arr[i]){
                freq++;
            }
        }
        if(freq>arr.length/2)return res;
        return -1;

    }

    public static void main(String[] args) {
        int[] arr={5,3,8,8,8,8,9};
        System.out.println(majorityElement(arr));
        System.out.println(mooreVoting(arr));
    }
}
