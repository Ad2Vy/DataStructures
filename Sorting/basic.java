package Sorting;

import java.util.*;

public class basic {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<Integer>();
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(50);
        Collections.sort(list);
        System.out.println(list)   ;
        list.sort(Collections.reverseOrder());
        int[] arr={5,1,2,3};
        System.out.println(list);

    }

}
