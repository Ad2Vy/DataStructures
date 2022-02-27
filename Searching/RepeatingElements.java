package Searching;


import java.util.Arrays;

public class RepeatingElements {
    static int repeat(int[] arr){
        boolean[] visited=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(visited[arr[i]]){
                return arr[i];
            }
            visited[arr[i]]=true;
        }

        return -1;
    }

    //Link list concept( detecting cycles)
    static int repeatEle(int[] arr){
        int slow=arr[0];int fast=arr[0];
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }while(slow!=fast);
        slow=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,2,0};
        System.out.println(repeat(arr));
        System.out.println(repeatEle(arr));
    }

}
