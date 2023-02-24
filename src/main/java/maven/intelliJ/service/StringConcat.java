package maven.intelliJ.service;
import java.lang.*;
import java.util.*;
public class StringConcat {
        public static List<Integer> findSubstring(String s, String[] words) {
            List<Integer> n = new ArrayList<>();
            StringBuffer wd= new StringBuffer();
            for(int i=0;i<words.length; i++){
                wd.append(words[i]);
                System.out.println(wd);
            }

            return n;
        }
        public static void main(String[] args){
            String s = "foogoldbestringfoobestgoldstring";
            String[] words = {"foo", "gold"};
            List<Integer> t = findSubstring(s, words);
            System.out.println(t);
        }
}
