package Mathematics;

public class primeNumber{
    public static void main(String[] args) {
        int a,b;
        a=6;
        b=25;
        getPrime(a,b);
    }

    private static void getPrime(int a, int b) {
        for(int i=a;i<=b;i++){
            if(i%2==0){
                continue;
            }
            if(i%3==0){
                continue;
            }
            for(int j=2;j<Math.sqrt(i);j+=1){
                if(i%j==0){
                    continue;
                }

                    System.out.println(i);

            }
            // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
        }
    }
}
