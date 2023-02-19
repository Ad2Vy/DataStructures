package Sorting.QuickSort;

import java.util.ArrayList;
import java.util.Stack;

public class mergeOverLapped {
    static void merge(int[][] arr){
        Stack<int[]> stack=new Stack<>();
        stack.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            int[] top=stack.peek();
            if(top[1]<arr[i][0]){
                stack.push(arr[i]);
            }
            else if(top[1]>arr[i][0]){
                top[1]=Math.max(arr[i][1],top[1]);
                stack.pop();
                stack.push(top);
            }
        }
        Stack<int[]> stack1=new Stack<>();
        while(!stack.empty()){
            stack1.push(stack.pop());
        }
        while(!stack1.isEmpty()){
            int[] t=stack1.pop();
            System.out.println(t[0]+" "+t[1]);
        }

    }

    public static void main(String[] args) {
        int[][] arr={{1,3},{2,4},{5,7},{6,8}};
        merge(arr);

    }
}
