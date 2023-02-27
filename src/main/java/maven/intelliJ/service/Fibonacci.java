package maven.intelliJ.service;

import java.util.Scanner;


public class Fibonacci{
    static int arr[];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        arr = new int[num+1];
        for(int i=0; i<num; i++){
            System.out.print(fibo(i)+" ");
        }
    }
    public static int fibo(int n){
        if(n==0 | n==1) return n;
        if(arr[n] != 0) return arr[n];
        else {
            arr[n] = fibo(n-2) + fibo(n-1);
        }
        return arr[n];
    }
}