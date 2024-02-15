package org.example;

public class AllSubset {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int idx = 0;
        String res = "";
        for(int i = 0 ; i < arr.length ; i++){
            res += "["+arr[i]+ "] , ";
        }
        while(idx<arr.length){
            for(int i = 0 ; i < arr.length ; i++ ){
                if(idx!=i) {
                    res += "[" + arr[i] + ", " + arr[idx] + "] , ";
                }
            }
            idx++;
        }
        res+="[";
        for(int i = 0 ; i < arr.length ; i++){
            if(i<arr.length-1) res += arr[i]+ ", ";
            else res+= arr[i]+"]";
        }
        System.out.println(res);
    }
}
