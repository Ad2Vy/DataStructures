package Recursion;

public class palindrome {
    static boolean isPal(String str,int s,int e){
        if(str.charAt(s)==str.charAt(e)){
            return true;
        }
        else if(str.charAt(s)!=str.charAt(e)){
            return false;
        }
        if(s<e){
            return isPal(str,s+1,e-1);
        }
        return true;
    }

    public static void main(String[] args) {
        String str="malyalam";
        int s=0,e= str.length()-1;
        System.out.println(isPal(str,s,e));
    }
}
