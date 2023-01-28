package Practise;

public class JosephusProblem {
    static int j(int n,int k){
        if(n<=1)return n;
        return (j(n-1,k)+k-1)%n + 1;
    }

    public static void main(String[] args) {
        System.out.println(j(5,3));
    }
}
