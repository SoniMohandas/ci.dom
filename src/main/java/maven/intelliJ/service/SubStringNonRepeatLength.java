package maven.intelliJ.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubStringNonRepeatLength {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int l = lengthOfNonRepeatSubstring(str);
        System.out.println(l);
    }
    //Find maximum length of a substring without repetition
    public static int lengthOfNonRepeatSubstring(String str){

        Map<Character, Integer> map = new HashMap<>();
        String s = "";
        for(int i=0, j=0; j<str.length(); j++){
            char ch = str.charAt(j);
            //Initially no value in the map so won't execute this block
            if(map.containsKey(ch)){
                i = Math.max(map.get(ch)+1, i);
            }
            System.out.println("i: "+i+" j: "+j);

            if(s.length()<j-i+1){ //value of i is zero until character repetition
                s = str.substring(i,j+1);
                System.out.println(s);
            }
            map.put(ch, j);//put visited characters in the map
        }
        return s.length();
    }
}
