package Recursion;

public class sumOfDigits {
    static int sum_of_Digits(int N){
        if(N<=9)
            return N;
        return (N%10)+sum_of_Digits(N/10);
    }
    // N%10 + (N/10)%10

    public static void main(String[] args) {
        int n=2335;
        System.out.println(sum_of_Digits(n));
    }
}
