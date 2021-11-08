package Recursion;

public class factorial {
    static int fact(int N,int k)
    {
        if(N==0||N==1){
            return k;//returning k in base case as it has stored the value of fact.
        }
        //changing atleast one parameter.
        return fact(N-1,N*k);
        //other variable k to make it tail recursive.
    }

    public static void main(String[] args) {
        int N=5;
        int k=1;
        System.out.println(fact(N,k));
    }
}
