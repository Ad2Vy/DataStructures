package Mathematics;

/**
 * how many digits are there in the number
 * If it an Integer value with unknown length()
 */
public class palindrome {
    //Iterative solution
    static boolean isPal(int N){
        String s="";
        s=s.concat(String.valueOf(N));
        int i=0,j=s.length()-1;
        while (i < j) {
            if((int)s.charAt(i) != (int)s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args){
        int N=1234321;
        System.out.println(isPal(N));
        System.out.println(Math.sqrt(999999));
    }

}
