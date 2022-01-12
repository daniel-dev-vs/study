package com.company;

import javax.sound.midi.SysexMessage;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        List<Integer> linha1 = new ArrayList<>(Arrays.asList(1,1,1,0,0,0));
        List<Integer> linha2 = new ArrayList<>(Arrays.asList(0,1,0,0,0,0));
        List<Integer> linha3= new ArrayList<>(Arrays.asList(1,1,1,0,0,0));;
        List<Integer> linha4 = new ArrayList<>(Arrays.asList(0,0,2,4,4,0));;
        List<Integer> linha5 = new ArrayList<>(Arrays.asList(0,0,0,2,0,0));;
        List<Integer> linha6 = new ArrayList<>(Arrays.asList(0,0,1,2,4,0));;
        List<List<Integer>> linhas = new ArrayList<>();
        linhas.add(linha1);
        linhas.add(linha2);
        linhas.add(linha3);
        linhas.add(linha4);
        linhas.add(linha5);
        linhas.add(linha6);

        int sum = hourglassSum(linhas);


        System.out.println(sum);
    }

    public static int _lastAnswer;
    public static List<List<Integer>> _arr;
    public static int _n;
    public static List<Integer> _answer;

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        _lastAnswer = 0;
        _arr = new ArrayList<>();
        _answer = new ArrayList<Integer>();
        _n = n;
         for (int i = 0; i < n; i++){
             _arr.add( new ArrayList<>());
         }

        for (List<Integer> query: queries ) {
            executeQuery(query.get(0),query.get(1),query.get(2));
        }

        return _answer;
    }

    public static void executeQuery(int type, int x, int y){
        int idx = (x ^ _lastAnswer) % _n;
        if(type == 1){
            _arr.get(idx).add(y);
        } else if(type == 2){
            int size = _arr.get(idx).size();
            _lastAnswer = _arr.get(idx).get( y % size );
            _answer.add(_lastAnswer);
        }
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int max = Integer.MIN_VALUE, sum =0;
        for(int i = 0; i < arr.size() -2; i++){
            for(int j =0; j <arr.get(i).size() - 2; j++){
              sum = sum(arr, i, j);
              if( sum > max)
                  max = sum;
            }

        }

        return max;
    }

    public static int sum(List<List<Integer>> arr, int row, int col){
        int sum = 0;

        sum += arr.get(row).get(col) + arr.get(row).get(col+1) + arr.get(row).get(col+2) +
                arr.get(row+1).get(col+1) + arr.get(row+2).get(col) + arr.get(row+2).get(col+1)+
                arr.get(row+2).get(col +2);

        return sum;

    }


    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here

        List<Integer> reversed = new ArrayList<>(a.size());

        for (int i = a.size() - 1; i > -1; i--) {
            reversed.add(a.get(i));

        }
        return reversed;

    }

    public static void scannerExampleString(){
        System.out.println("please input your name");
        Scanner input = new Scanner(System.in);

        String name = input.next();
        System.out.println("Welcome " + name);
        input.close();
    }

    public static void testTrimMethod(){
        String s = " daniel estuda mesmo gatao ";
        s = s.trim();
        System.out.println(s);
    }

    public static void stringExampleCompare(){
        String s1 = "I love";
        s1 += " Java";

        String s2 = "I";
        s2 += " love Java";

        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s2.equals(s1));
    }

    public static int sum(List<Integer> ar){
        int sum = 0;
        for(int i =0; i < ar.size(); i++){
            sum+= ar.get(i);
        }
        return sum;
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
        List<Integer> r = new ArrayList<>(Arrays.asList(0,0));

        for(int i = 0; i < 3; i++){
            if(a.get(i) == b.get(i)){
                continue;
            }else if(a.get(i) > b.get(i)){
                r.set(0,r.get(0) + 1) ;
            } else {
                r.set(1,r.get(1) + 1);
            }
        }
        return r;
    }
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long bigSum = 0;

        for (long item: ar ) {
            bigSum += item;
        }
        return bigSum;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sumOne =0, sumTwo =0;
        for (int i = 0; i < arr.size(); i++){
            int reverseIndex = arr.get(i).size() - (i +1);
            sumOne = -sumOne + (-arr.get(i).get(i));
            sumTwo = -sumTwo + (-arr.get(i).get(reverseIndex));
        }

        return Math.abs(sumOne - sumTwo);
    }

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double pos =0, neg =0, zero = 0, total = arr.size();
        for (int value: arr) {
            if(value > 0)
                pos++;
            else if(value < 0)
                neg++;
            else
                zero++;
        }

        System.out.printf("%.6f \n", pos/total);
        System.out.printf("%.6f \n", neg/total);
        System.out.printf("%.6f \n", zero/total);
    }

    public static void staircase(int n) {
        // Write your code here

        for(int i = 1; i < n+1; i++){
            for(int j = n; j > 0; j--){
                if(j > i)
                    System.out.printf(" ");
                else
                    System.out.printf("#");
            }
            System.out.printf("\n");
        }
    }

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min = Long.MIN_VALUE, max = Long.MAX_VALUE;
        for(int i = 0; i < arr.size(); i++){
            long sum = 0;
            for(int j = 0; j < arr.size(); j++){
                if(i == j)
                    continue;
                sum += arr.get(j);
            }
        if(sum < min)
            min = sum;

        if(sum > max)
            max = sum;
        }


        System.out.printf("%d %d", min, max);
    }

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max =  Integer.MIN_VALUE, lastMx = 0 , count =0;

        for(int value : candles){
            if(value > max){
                max = value;
                lastMx = max;
                count =0;
            }

            if(lastMx == value){
                count++;
            }
        }

        return count;
    }

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String string24hour;
        if(s.indexOf('P') > -1)
            string24hour = pmTo24(s);
        else
            string24hour = amTo24(s);

        return string24hour;
    }

    public static String pmTo24(String s){
        int hour = getHour(s);

        if(hour != 12)
            hour += 12;


        String _24hour = formatTo24(hour,s);

        return _24hour;
    }

    public static String amTo24(String s){
        int hour = getHour(s);

        if(hour == 12)
            hour = 0;

        String _24hour = formatTo24(hour,s);

        return _24hour;
    }

    public static int getHour(String s){
        return Integer.parseInt(s.substring(0,2));
    }

    public static String formatTo24(int hour, String s){
        String stringHour = String.valueOf(hour);
        if(stringHour.length() == 1)
            stringHour = "0".concat(stringHour);

        String r = stringHour.concat(s.substring(2,8));

        return r;
    }

    /**
     *       #
     *  int nmber = 2;
     *         int nmber2 = 0;
     *
     *        try {
     *             int result = nmber / nmber2;
     *        }catch(Exception e){
     *            e.printStackTrace();
     *
     *         }
     */


}


