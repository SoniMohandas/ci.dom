package maven.intelliJ.controller;


public class Paliandrome {
    public static void main(String[] args){

        String str = "malayalam";
        int l = str.length();
        boolean b = true;
        for (int i =0; i<l; i++){
            if(str.charAt(i) != str.charAt(l-i-1)){
                b = false;
                break;
            }
        }
        if(b) System.out.println((str + " is paliandrome"));
        else System.out.println(str + " is not a paliandrome");
    }
}
