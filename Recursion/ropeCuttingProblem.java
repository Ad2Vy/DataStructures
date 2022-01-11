package Recursion;
/*
*problem statement: cut the rope in maximum pieces depending upon the lengths given.
*  Base case would be to check for n=0 which means we have reached the solution.
* other would be to check if n is negative
 */
public class ropeCuttingProblem {
    static int cutRope(int N,int a,int b,int c){
        if(N==0)
            return 0;
        if(N < 0)
            return -1;
        int res=Math.max(Math.max(cutRope(N-a,a,b,c), cutRope(N-b,a,b,c)),cutRope(N-c,a,b,c)) ;

        if(res==-1)
            return -1;
        return res+1;
    }

    public static void main(String[] args) {
        int N=24,a=10,b=2,c=12;
        System.out.println(cutRope(N,a,b,c));
    }
}
