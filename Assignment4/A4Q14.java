package Assignment4;
import java.util.Arrays;
public class A4Q14 {
    public static void findMinimumDifferencePair(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int minDiff = Integer.MAX_VALUE;
        int num1 = 0;
        int num2 = 0;

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            int diff = Math.abs(arr1[i] - arr2[j]);

            if (diff < minDiff) {
                minDiff = diff;
                num1 = arr1[i];
                num2 = arr2[j];
            }

            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println("Minimum difference pair: (" + num1 + ", " + num2 + ")");
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        findMinimumDifferencePair(arr1, arr2);
    }
}


