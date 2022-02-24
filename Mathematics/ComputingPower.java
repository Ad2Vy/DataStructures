package Mathematics;

public class ComputingPower {
    static int compute(int n, int m){
        //naive:
        int res=n;
        for(int i=m;i>=1;i--){
            res=res*n;
        }
        return res;

    }

    static int power(int n, int m){
        if(m==0){
            return 1;
        }
        int temp=power(n,m/2);
        temp=temp*temp;
        if(n%2==0){
            return temp;
        }
        else
            return temp*n;
    }

    static int iterativePower(int n,int m){
        int res = 1;
        while(m>0){
            if(n%2!=0){
                res=res*n;
            }
            n=n*n;
            m=m/2;
        }
        return res;
    }


    public static void main(String[] args) {
        int n=2,m=6;
        System.out.println(compute(n,m));
        System.out.println(power(n,m));
    }
}
