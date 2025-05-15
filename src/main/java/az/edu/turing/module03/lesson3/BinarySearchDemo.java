package az.edu.turing.module03.lesson3;

import java.util.Collections;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 7, 12, 18, 25, 30};
        int key = 25;
        int lower = 0;
        int upper = arr.length - 1;

        while (lower <= upper) {
            int mid = (upper + lower) / 2;
            if (arr[mid] == key) {
                System.out.println(mid);
                break;
            } else if (arr[mid] > key) {
                upper = mid - 1;
            } else if (arr[mid] < key) {
                lower = mid + 1;
            }
        }

    }
}
