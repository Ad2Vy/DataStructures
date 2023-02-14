package Searching;


import java.util.Arrays;
// make a visited array for repeating elements

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

    //Repeating elements no O(1) space and O(N);
    static int findRepeat(int[] a){
        for(int i=0;i<a.length;i++){
            int m=i;int j=a[i];
            if(a[a[i]]==a[i]){
                if(a[i]==i){
                    continue;
                }
                else
                    return a[i];
            }
            else{

                int temp=a[m];
                a[m]=a[j];
                a[j]=temp;
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr={0,1,3,2,2};
//        System.out.println(repeat(arr));
//        System.out.println(repeatEle(arr));
        System.out.println(findRepeat(arr));
    }

}
