package Mathematics;

import java.util.Arrays;

public class threeDivisor {
    public static void main(String[] args) {
        int N=99999;
        System.out.println(divisor(N));
    }

    private static int divisor(int n) {
        if(n==1){
            return 1;
        }
        boolean[] isPrime =new boolean[n+1];
        Arrays.fill(isPrime, true);
        int count=0;
        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                if(i*i<=n)
                    count+=1;
                for(int j=i*i;j<=n;j+=i){
                    isPrime[i]=false;
                }
            }
        }
        return count;


    }
    }


