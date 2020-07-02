package wielowatkowosc.zadanie3;

import javax.swing.text.AttributeSet;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class Main {

    public static void main(String[] args) {
        int[] number = new int[10000];
        Random r = new Random();

        for (int i = 0; i < number.length; i++) {
            number[i] = r.nextInt(10000);
        }
       final int[] numbers1 = Arrays.copyOf(number, number.length);
        final int[] numbers2 = Arrays.copyOf(number, number.length);
        Callable<Integer> callable = new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Arrays.sort(numbers1);
                return 0;
            }
        };

        Callable<Integer> callable2 = new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                bubbleSorted(numbers2);
                return 0;
            }
        };


    }

    static int[] bubbleSorted(int[] sorted) {

        int n = sorted.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (sorted[j - 1] > sorted[j]) {
                    //swap elements
                    temp = sorted[j - 1];
                    sorted[j - 1] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }


}

