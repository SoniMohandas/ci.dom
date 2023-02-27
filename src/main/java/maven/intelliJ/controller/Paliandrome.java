package maven.intelliJ.controller;

import java.util.Scanner;

public class Paliandrome{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        if(pal(str)) System.out.println(str+" is paliandrome");
        else System.out.println(str+ " is not paliandrome");
    }
    public static boolean pal(String str){
        boolean b = true;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
                b = false;
                break;
            }
        }
        return b;
    }
}