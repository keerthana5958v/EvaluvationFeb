package org.example;

public class ProductElements {
    public static void main(String[] args) {
        int[] a1 = new int[]{1,2,3,4};
        int[] a2 = new int[a1.length];

        for(int i = 0 ; i < a1.length ; i++){
            a2[i]=1;
            for(int j = 0 ; j < a1.length ; j++){
                if(j!=i) a2[i] *= a1[j];
            }
//            a2[i] /= a1[i];
            if(i<a1.length-1)System.out.print(a2[i]+", ");
            else System.out.print(a2[i]);

        }
    }
}
