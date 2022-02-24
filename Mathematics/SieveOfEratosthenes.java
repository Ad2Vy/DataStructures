package Mathematics;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author aditya vyas
 *  printing all prime numbers till num
 *
 *  naive solution: loop through n numbers and check if they are prime
 *          ->if prime: Print()
 *
 *
 *  Efficient Solution: SieveOfEratosthenes
 *  approach: create an boolean array of n elements, set the false;
 *      if number is prime mark true;
 *      check for all the true values if they divide the current number;
 *       -> if yes: mark false;
 *       -> else : mark true;
 */


public class SieveOfEratosthenes {

    static void sieve(int n){
        boolean[]  isPrime=new boolean[n];
        Arrays.fill(isPrime,true);
        for(int i=2;i<n;i++) {
            if (isPrime[i])
                for (int j = i*i; j < n; j=j+i) {
                    if (j % i == 0) {
                        isPrime[j] = false;
                    }
                }
        }
        for(int i=2;i<isPrime.length;i++){
            if(isPrime[i])System.out.println(i);
        }

    }


    public static void main(String[] args) {
        int num=34;
        sieve(num);
    }


}
