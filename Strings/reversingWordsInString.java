package Strings;

import java.util.Arrays;
import java.util.Collections;

public class reversingWordsInString {
    static String reverseWords(String s){
        int start=0;
        char[] str=s.toCharArray();
        for(int end=0;end<str.length;end++){
            if(Character.isWhitespace(str[end])){
                reverse(str,start,end-1);
                start=end+1;
            }
        }
        reverse(str,start,str.length-1);//reversing the last word
        reverse(str,0,str.length-1);
        s = new String(str);
        return s;
    }
    static void reverse(char[] str,int low, int high){
        while(low<=high){
            char temp=str[low];
            str[low]=str[high];
            str[high]=temp;
            low++;high--;
        }
    }

    public static void main(String[] args) {
        String s="BurdenedGloriouspurpose";

        System.out.println(reverseWords(s));
    }
}
