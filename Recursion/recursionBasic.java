package Recursion;

public class recursionBasic {
    public static void main(String[] args) {
        int N=5;
        fun1(N);
    }
    static void fun1(int n){
        if(n==0) return ;
        System.out.println(n);
        fun1(n-1);
        System.out.println(n);
    }
}
/**
 * T(n)=T(n/2)+T(n/2)
 *       /  \
 *   T(n/4)+T(n/4)
 *
 * n=4 : hello fun(2)-> hello fun(1)-> hello->fun(0): return
 *   |             |               |->hello->fun(0): return
 *   |            |-->fun(1)->hello->fun(0) : return
 *   |                   |->hello->fun(0) : return
 *   |---->fun(2)
 * void funt(int n)
 * {
 *     if(n<=0) // Base case
 *      return;
 *     print(hello);
 *     fun(n/2);
 *     fun(n/2);
 * }
 */