package Searching;


import java.util.Arrays;

public class RepeatingElements {
    static int repeat(int[] arr){
        boolean[] visited=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(visited[arr[i]]==true){
                return arr[i];
            }
            visited[arr[i]]=true;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,2,0};
        System.out.println(repeat(arr));
    }

}
