package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static int knapsack(weights[] arr,int N){
        int count=0;
        Arrays.sort(arr,new MyCmp());

        for(int i=0;i<arr.length;i++){
            if(arr[i].getWeight()<=N){
                count+= arr[i].value;
                N= N- arr[i].weight;
            }
            else{
                count+=(N)*(arr[i].getValue()/arr[i].getWeight());
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        weights[]  arr= {new weights(50,600),new weights(20,500),new weights(30,400)};
        System.out.println(knapsack(arr,70));

    }
}

class MyCmp implements Comparator<weights>
{
    @Override
    public int compare(weights o2, weights o1) {
        return o1.value/o1.weight  - o2.value/ o2.weight;
    }
}


class weights{
    int weight;
    int value;
    weights(int w,int v){
        this.weight=w;
        this.value=v;
    }
    int getWeight(){
        return weight;
    }
    int getValue(){
        return value;
    }

}