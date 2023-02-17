package Strings;

public class PatternSearching {

    static void search(String str,String pat){
        int n=str.length()-1,m=pat.length()-1;
        if(m>n)return;

        for(int i=0;i<n-m;i++){
            String temp=str.substring(i,i+m+1);
            if(temp.compareTo(pat)==0){
                System.out.print(i+" ");
            }
        }
    }

    //This can also be done by running other loop and comparing individual character.

    public static void main(String[] args) {
        String str="AABAABAAB";
        String pat="AA";
        search(str,pat);

    }

}
