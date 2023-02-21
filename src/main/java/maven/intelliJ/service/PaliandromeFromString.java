package maven.intelliJ.service;

import java.util.*;
class Solution {
    public static String longestPalindrome(String s) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<s.length()-1; i++){
            for(int j=i+2; j<s.length(); j++){
                String str = s.substring(i, j);
                for(int k=0; k<str.length(); k++){
                    if(str.charAt(k) != str.charAt(str.length()-k-1)) break;
                    else list.add(str);
                }

            }
        }
        return Collections.max(list, Comparator.comparing(String::length));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(longestPalindrome(str));
    }
}