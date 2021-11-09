package Greedy;

public class MinCoins {
    public static int minCoin(int N){
        int count=0;
        int[] arr={10,5,2,1};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=N){
                int coin= N/arr[i];
                N=N- arr[i]*coin;
                System.out.println("coins of "+arr[i]+" are : "+coin);
                count+=coin;
            }
            if(N==0)
                break;
        }

        return count;
    }

    public static void main(String[] args) {
        int n=52;
        System.out.println("min no. of coins for required sum of money is: "+minCoin(n));
    }


}
