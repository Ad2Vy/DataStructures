package Mathematics;

public class primeFactor {
    public static void main(String[] args) {
        int num = 999999;
        prime_factors(num);
    }
    public static void prime_factors(int n){
        while(n%2==0){
            System.out.println("2");
            n=n/2;
        }
        while(n%3==0){
            System.out.println("3");
            n/=3;
        }
        for(int i=5;i*i<=n;i+=6){
            while(n%i==0){
                System.out.println(i);
                n/=i;
            }
            while(n%(i+2)==0){
                System.out.println(i+2);
                n/=(i+2);
            }
        }

    }
}
