package Strings;

/**
 * Naive : take string s1 and reverse it to s2
 * Compare s1 and s2.
 */
public class palindromeCheck {
    // by reversing the strings and comparing. time complexity :theta(n) Aux theta(n)
    static boolean isPal(String s){
        //Strings are immutable.
        StringBuilder rev=new StringBuilder(s);
        rev.reverse();
        return s.equals(rev.toString());
    }


    //By checking each last and first char. time complexity: O(n) aux: theta(1)
    static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    //main method
    public static void main(String[] args) {
        String s="ABCBA";
        System.out.println("method 1: "+isPal(s));
        System.out.println("method 2: "+isPalindrome(s));
    }
}
