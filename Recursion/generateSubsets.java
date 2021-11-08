package Recursion;

public class generateSubsets {
    static void subset(String s,int i,String curr) {
        if (i == s.length())
        {
            System.out.println(curr);
            return;
        }
        subset(s,i+1,curr);//not include the i+1 th element
        subset(s,i+1, curr.concat(String.valueOf(s.charAt(i))));// include the i+1 th element
    }

    static void generate(String str,int i,String curr){
        if(i == str.length()){
            System.out.println(curr);
            return;
        }
        generate(str,i+1,curr);
        generate(str,i+1,curr.concat(String.valueOf(str.charAt(i))));

    }

    public static void main(String[] args) {
        String s="ABCD";
        String curr="";
        int i=0;
        subset(s,i,curr);
//        generate(s,i,curr);
    }
}
