package az.edu.turing.module03.lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSortDemo {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[] {2, 4, 7, 12, 18, 25, 30, 1};
      /*  for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }*/
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }


    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
