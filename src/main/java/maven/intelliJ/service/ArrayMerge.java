package maven.intelliJ.service;

import java.util.Arrays;

public class ArrayMerge {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int l1 = nums1.length;
            int l2 = nums2.length;
            double median;
            int[] numArray = new int[l1+l2];
            System.arraycopy(nums1,0,numArray,0,l1);
            System.arraycopy(nums2, 0, numArray, l1, l2);
            Arrays.sort(numArray);
            if((l1+l2)%2!=0) {median = numArray[(l1+l2+1)/2];
            System.out.println((l1+l2+1)/2);}
            else {
                median = (numArray[(l1 + l2) / 2 ] + numArray[(l1 + l2) / 2 - 1]) / 2.0;
                System.out.println((l1 + l2) / 2 );
                System.out.println((l1 + l2) / 2 -1);
                for(int k : numArray)
                    System.out.print(k+" ");
            }
            return median;
        }

    public static void main(String[] args){
        int[] n1 = {1,2};
        int[] n2 = {3,4};
        System.out.println(findMedianSortedArrays(n1,n2));
    }
}
