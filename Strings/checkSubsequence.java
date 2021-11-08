package Strings;

public class checkSubsequence {

    static boolean check(String s1,String s2){
        if(s1.length()<s2.length())
            return false;
        int j=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(j))
                j++;
        }
        return j==s2.length();
    }

    static boolean isSub(String s1,String s2,int n, int m){
        if(m==0)
            return true;
        if(n==0)
            return false;
        if(s1.charAt(n) == s2.charAt(m))
            return isSub(s1,s2,n-1,m-1);
        else
            return isSub(s1,s2,n-1,m);
    }

    //main method
    public static void main(String[] args) {
        String s1="ABCDAB";
        String s2="DB";
        int n=s1.length()-1;
        int m=s2.length()-1;
        System.out.println(check(s1,s2));
        System.out.println(isSub(s1,s2,n,m));
    }
}
