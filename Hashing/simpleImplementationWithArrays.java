package Hashing;

import java.lang.reflect.Array;
import java.util.Arrays;

public class simpleImplementationWithArrays {
    public static void main(String[] args) {
        int[] arr=new int[15];
        Arrays.fill(arr,0);
        insert(arr,5);
        insert(arr,6);
        insert(arr,10);
        get(arr,1);
        get(arr,10);
        delete(arr,10);
    }

    static void insert(int[] arr,int n){
        arr[n-1]=1;
    }
    static void get(int[] arr,int n){
        if(arr[n-1]==1){
            System.out.println(n);
            return;
        }
        System.out.println("not present");;
    }
    static void delete(int[] arr,int n){
        arr[n-1]=0;
    }

}
