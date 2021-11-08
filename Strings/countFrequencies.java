package Strings;

public class countFrequencies {
    static void getFreq(String s){
        int[]  count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        //print in sorted order
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                System.out.println((char)(i+'a')+" "+count[i]);
            }

        }

    }

    public static void main(String[] args) {
        String s="helloboys";
        getFreq(s);
    }
}
