package Hashing;

import java.util.HashSet;
import java.util.Iterator;

/**
 * add to add
 * contains to check if element is present
 * iterator to give iterator variable
 * size for getting the size of the hashset
 * remove to remove the element
 * isEmpty to check if hashset is empty or not
 * clear to delete all elemtns
 */

public class hashSetJava {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("burdened");
        hashSet.add("with");
        hashSet.add("glorious");
        hashSet.add("purpose");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("glorious"));
        Iterator<String> i= hashSet.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println("Size of the hash "+ hashSet.size());
        hashSet.remove("with");
        System.out.println("Size of the hash "+ hashSet.size());
        for(String s:hashSet){
            System.out.print(s+" ");
        }
        hashSet.clear();
        System.out.println(hashSet.isEmpty());

    }
}
