package az.edu.turing.module03.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSortDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Before sort");
        System.out.println(Arrays.toString(array));
        sort(array, 0, array.length - 1);

        System.out.println("After sort");
        System.out.println("\n \n" + Arrays.toString(array));;
    }


    //[ 4, 2, 12, 7, 12, 9, 45, 25, 22};
    static void sort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(array, left, middle);
            sort(array, middle + 1, right);
            merge(array, left, middle, right);

            System.out.println(Arrays.toString(array));
        }

    }

    static void merge(int[] array, int left, int middle, int right) {

        int[] leftArray = new int[middle - left + 1];
        int[] rightArray = new int[right - middle];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < rightArray.length; j++) {
            rightArray[j] = array[middle + 1 + j];
        }


        int i = 0, j = 0;

        int k = left;
        while (i < leftArray.length && j < rightArray.length){
            if (leftArray[i] < rightArray[j]){
                array[k++] = leftArray[i++];
            }else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < leftArray.length){
            array[k++] = leftArray[i++];
        }
        while (j < rightArray.length){
            array[k++] = rightArray[j++];
        }

    }

}
