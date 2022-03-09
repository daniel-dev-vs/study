package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Quizz {
    public static void main(String[] args) {

        question2();
        

    }
    static class InnerClass implements Comparator<String>
    {
        public int compare(String s1, String s2)
        {
            return s2.compareTo(s1);
        }
    }

    public static void question1(){
        String[] ar= {"c","d","b","a","e"};
        InnerClass in=new InnerClass();
        //Arrays.parallelSort(ar, in);
        Arrays.sort(ar);
        for(String str : ar)
            System.out.println(str +"");
        System.out.println(Arrays.binarySearch(ar, "b"));
    }

    public static void question2(){
        Set s=new LinkedHashSet();
        s.add("1");
        s.add(1);
        s.add(3);
        s.add(2);
        System.out.println(s);
    }
}
