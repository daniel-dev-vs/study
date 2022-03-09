package crackingInterview.bigO;

public class page46 {
    public static void main(String[] args) {

        printUnorderedPairs(new int[]{0,1,2,3,4,5,6,7});
    }


    static void printUnorderedPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print(array[i] + "," + array[j] + " ");

            }
            System.out.println();
        }
    }
}
