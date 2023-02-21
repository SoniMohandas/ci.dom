package maven.intelliJ.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import java.util.Scanner;

//import static jdk.internal.jrtfs.JrtUtils.next;

class Person{

    public static void main(String[] args){
        String str = "aaaaapppppjjyyyr";
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        char ch='a' ;
        char[] c = str.toCharArray();
        for(char chr : c){
            if(ch==chr)
                map.put(chr, map.get(chr)+1);
//            ch = next(chr);

        }
    }
}