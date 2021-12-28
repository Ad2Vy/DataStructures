package Mathematics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloWorld{

    // input : "my name is aditya"
    //ouput : "ym eman si aytida"
    public static String reverse(int high,String str){
        String aux="";
        for(int i=high-1;i>=0;i--){
            aux=aux+Character.toString(str.charAt(i));
        }
        return aux;
    }
    public static void main(String[] args) {
            String str="my name is aditya";
        List<String> list= Arrays.asList(str.split(" "));

        System.out.println(list);
        for(int i=0;i<list.size();i++){
            String temp=reverse(list.get(i).length(),list.get(i));
            System.out.print(temp+" ");
        }



    }
 }