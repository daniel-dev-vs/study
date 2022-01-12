package com.company;

public class IntroductionToAlgo {
    public static void main(String[] args) {
        _100vs2();
    }

    public static void insertionVsMerge(){
        int n = 2;

        while (n > Math.pow(2,n/8.0f))
            n+=1;

        System.out.println(n);
    }

    public static void _100vs2(){
        int n = 2;
        while( 100 * Math.pow(n,2) > Math.pow(2,n) ){
            n++;
        }

        System.out.println(n);
    }
}
