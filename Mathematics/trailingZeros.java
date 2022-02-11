package Mathematics;

public class trailingZeros {
    public static void main(String[] args) {
        int num =12;
        System.out.println(factorial(num));
        //System.out.println(zeros(num));
        System.out.println(trail(num));

    }
    //Trailing zeros are the count of 5 factors in the digit
    static int trail(int n){
        int count=0;
        for(int i=5;i<=n;i=i*i){
            count+=n/i;
        }
        return count;
    }


    public static int zeros(int num){
        int count = 5;
        int trail=0;
//        int fact=factorial(num);
        while(count<=num){
            trail+=(int)num/count;
            count=count*5;
            System.out.println(trail);
        }

        return trail;
    }
    public static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
}
