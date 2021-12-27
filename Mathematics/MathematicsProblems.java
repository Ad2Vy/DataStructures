package Mathematics;

import java.util.Arrays;

//using Math equations can really save time in some cases.
//for example in case of AP and GP using formulas can be efficient.
//Also solving quadratic equations.
public class MathematicsProblems {
    // Problem count number of digits in a number
    public static int countDigit1(int num){
        if(num<=0){
            return 0;
        }
        return countDigit1(num/10)+1;
/*        using loops
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;*/
    }
    // Problem count number of digits in a number (efficient)
    public static int countDigit2(int num){
        //using log of 10
        return (int)Math.log10((double)num)+1;
    }

    // Check if the number is a Prime Number
    public static boolean checkPrime(int num){
        for(int i=2;i<=Math.sqrt((double)num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    // generating prime numbers less than the given number;
    public static void sieveOfEratosthenes(int num){
        boolean[] isPrime=new boolean[num+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i<num;i++){
            if(isPrime[i]) {
                for (int j = 0; (i * (j + i)) <= num;j++ ) {
                    isPrime[i*(i+j)]=false;
                }
            }
        }
        for(int i=2;i<num;i++)
        {
            if(isPrime[i]){
                System.out.print(i+" ");
            }
        }
    }

    //Greatest Common Divisor
    public static int GCD(int a, int b){
        if( a==0)return b;
        return GCD(b%a,a);
    }





    public static void main(String[] args) {
//        System.out.println(countDigit1(1059));
//        System.out.println(countDigit2(9));
        System.out.println(checkPrime(57));
        sieveOfEratosthenes(57);
        System.out.println();
        System.out.println(GCD(48,32));
    }

}
