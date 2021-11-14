package BackTracking;

// Given a String, print all permutations that does not contain "AB" As SubString

//String = "ABC"

public class SubString {
    // Naive Method:::
    public static void permute(String str,int l , int r){
        if(l==r) {
            if (!str.contains("AB")) {
                System.out.print(str + " ");
            }
            System.out.println(str);
            return;
        }
        for(int i=l;i<=r;i++){
            if(isSafe(str,l,i,r)) {
                str = new String(swap(str, i, l));
                permute(str, l + 1, r);
                str = new String(swap(str, i, l));
            }
        }
    }
    public static char[] swap(String str, int l, int r){
        char[] ch= str.toCharArray();
        char temp=ch[r];
        ch[r]=ch[l];
        ch[l]=temp;
        return ch;
    }


//    boolean isSafe function to prevent recursion for the specific case. Here sub string
    static boolean isSafe(String str, int l , int i, int r){
        if(l!=0 && str.charAt(l-1)=='A' && str.charAt(i)=='B'){
            return false;
        }
        if(r==l+1 && str.charAt(l)=='A' && str.charAt(l)=='B'){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="ABC";
        permute(str,0,str.length()-1);
    }

}
