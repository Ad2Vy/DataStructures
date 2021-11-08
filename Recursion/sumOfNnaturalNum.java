package Recursion;

public class sumOfNnaturalNum   {
    static int sumToN(int N){
//        return N*(N-1)/2;
        if(N<=1){
            return N;
        }
        return sumToN(N-1)+N;
    }
    //main
    public static void main(String[] args) {
        int n=10;
        System.out.println(sumToN(n));
    }
}
// 1+2+3+4+5+6+7+8+9+10