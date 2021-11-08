package Recursion;

import java.util.Arrays;

/**
 *  1 _ _ -> _ _ 1   (n==1)
 *  1                              1 (n==2)
 *  2 _ _ -> 2 1 _ -> _ 1 2 -> _ _ 2
 *
 *
 */
public class TowerOfHanoi {
    static void toh(int n,char A,char B,char C){
        if(n==1) {
            System.out.println("Move 1 from " + A + " to " + C);
            return;
        }
        toh(n-1,A,C,B);
        System.out.println("Move "+n+" from "+A+" to "+C);
        toh(n-1,B,A,C);

    }

    public static void main(String[] args) {
        int n=3;
        toh(n,'A','B','C');
    }
}
