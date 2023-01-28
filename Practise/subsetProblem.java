package Practise;

// "ABC"
//
public class subsetProblem {

    static void subset(String cur,String str,int i){
        if(i==str.length()){
            System.out.println(cur);
            return;
        }
        subset(cur,str,i+1);
        cur+=str.charAt(i);
        subset(cur,str,i+1);

    }

    public static void main(String[] args) {
        subset("","ABCD",0);
    }
}
