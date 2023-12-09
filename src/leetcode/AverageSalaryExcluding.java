package leetcode;

public class AverageSalaryExcluding {
    public static void main(String[] args) {
        int[] salary = new int[]{48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        System.out.println(average(salary));
    }

    public static double average(int[] salary) {
        double max = 0;
        double min = Double.MAX_VALUE;
        double sum = 0;

        for (int val: salary ) {

            if(val > max)
                max = val;

            if(val < min)
                min = val;

            sum+=val;
        }

        double average = (sum - max - min) / (salary.length - 2);

        return average;
    }
}
