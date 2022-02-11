package Mathematics;

import java.sql.Time;

public class CountDigits {
    //recursive solution for counting digits in a number
    static int countRecursive(int n){
        if (n<10){
            return 1;
        }

        return countRecursive(n/10)+1;
    }

    //non recursive using loop
    static int countNonRecursive(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

    //Efficient approach using log base 10
    static int countDigitsEff(int n){
        return (int)Math.log10((double)n)+1;
    }

    public static void main(String[] args) {
        int n=8234523;
        System.out.println("recursive: "+countRecursive(n)+"\nnon recursive: "+countNonRecursive(n)+"\nEfficient: "+countDigitsEff(n));
    }

}
