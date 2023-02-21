package maven.intelliJ.service;

import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.Math;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GoldCollection {

    public static int collectGold(int N,int[] G){

        int max =Arrays.stream(G).max().getAsInt();
        List<Integer> list = new ArrayList<>();
            for(int i=1; i<N; i++){
                for(int j = 1; j<=(max/2)+1; j++) {
                    if ((G[i] * G[j]) == max)
                        list.add(G[i] + G[j]);
                }
            }
        return max+Collections.max(list);


        }
        public static void main (String[]args)
        {
            Scanner sc = new Scanner (System.in);

            //INPUT [uncomment & modify if required]
            int N = sc.nextInt ();

            int[] G = new int[N];
            for (int i = 0; i < N; i++)
            {
                G[i] = sc.nextInt ();
            }

            sc.close ();

            //OUTPUT [uncomment & modify if required]
            System.out.print(collectGold(N,G));
        }
    }