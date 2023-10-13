package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class litters {
    public static void main(String[] args){
        Character[] bukwy = new Character[33];
        for (int i = 1; i < bukwy.length; i++) {
            bukwy[0]= '\u0410'-1;
            bukwy[i]= (char) (bukwy[i-1]+1);



                System.out.println(bukwy[i]);
    }
}}
