package Recursion;

public class fibonacci {
    static int fib(int N){
        if(N<=1){
            return N;
        }
        return fib(N-1)+fib(N-2);
    }
    // fib(5) --> return fib(3) + fib(4)=> fib(2)  +  fib(3)=> return fib(1) + fib(2)=> return fib(0) + fib(1);
    //                     |        |        |          |               |        |                |        |
//                         |       (3)      (1)        (2)              |       (1)              (0)    ( 1 )
    /**                    |                 |                         (1)
     *                     |                 |
     *                     |                return fib(0) + fib(1)
     *                    (2)                         |         |
     *                     |                         (0)       (1)
     *                     |
     *                     |
     *                   return fib(1) + fib(2)=> return fib(0) + fib(1)
     *                            (1)      (1)              (0)      (1)
     *
     *
     *
     *
     *
     *
     */
    public static void main(String[] args) {
        int N=6;
        System.out.println(fib(N));
    }
}
// 0 1 1 2 3 5
