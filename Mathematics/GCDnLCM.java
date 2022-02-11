package Mathematics;

public class GCDnLCM {
    public static void main(String[] args) {
        int a=24,b=12;
        System.out.println(lcm(a,b));

    }
    public static int divisor(int a, int b){
        if (b == 0)
            return a;
        return divisor(b,a%b);
    }
    public static int lcm(int a, int b)
    {
        return (a * b) / divisor(a, b);
    }
}
