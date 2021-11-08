package Strings;

import java.util.HashMap;

/**
 *  str= "abccb";
 *  output should be b.
 *  create a hash map and check is string.charAt(i) is in hashmap.
 *  if present:
 *      res=min(getValue(),res);
 *
 */
public class leftMostRepeatingChar {
    // Using HashMaps
    static int findLeft(String s){
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int res=1000;
        for(int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                res=Math.min(res,map.get(s.charAt(i)));
            }
            else
                map.put((s.charAt(i)),i);
        }
        return res;
    }

    //using loops (Naive)
    static int findLeftMostNaive(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j))
                    return i;
            }
        }
        return -1;
    }
    //Better approach using count array to store the frequencies of characters.
    static int findLeftMostUsingCount(String s){
        int[] count=new int[256];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)]>1){
                return i;
            }
        }
        return -1;
    }
    //Efficient Solution
    static int LeftMostUsingCharAsIndex(String s){
        int[] index=new int[256];
        int res=1000;
        for(int i=0;i<s.length();i++){
            if (index[s.charAt(i)] == -1) {
                index[s.charAt(i)]=i;
            }
            else
                res=Math.min(res,index[s.charAt(i)]);
        }
        return (res==1000)?-1:res;
    }

    public static void main(String[] args) {
        String s="abccb";
        System.out.println(findLeft(s));
    }
}
