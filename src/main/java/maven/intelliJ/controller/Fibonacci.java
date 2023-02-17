package maven.intelliJ.controller;

import java.util.Scanner;

public class Fibonacci {
    public static int[] a;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        a = new int[num + 1];
        for (int i=0; i<num; i++) System.out.print(fibo(i)+ " ");
    }
    public static int fibo(int num){
        if(num == 0 | num == 1) return num;
        if(a[num] != 0) return a[num];
        else{
            a[num] = fibo(num - 1) + fibo(num - 2);
        }
        return a[num];
    }
}
