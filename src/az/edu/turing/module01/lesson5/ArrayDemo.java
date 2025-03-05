package az.edu.turing.module01.lesson5;

public class ArrayDemo {


    public static void main(String[] args) {

        int a = 5;
        int[] arr = new int[] {1, 2};

        int[][] arr2 = {
                {1, 2},
                {4, 5},};

        int[][] inrArr = arr2;

        int[][][] threeDimensionalArr = {
                {{1, 2, 3}},
                {{4, 5, 6}},
                {{7, 8, 9}}
        };



        int[][][] array = {
                {
                        {1, 2, 3, 4}, // [0][0][0]
                        {5, 6, 7, 8},
                        {9, 10, 11, 12}
                },
                {
                        {13, 14, 15, 16},
                        {17, 18, 19, 20},
                        {21, 22, 23, 24}
                }
        };


        System.out.println(arr2[0][1]);
        System.out.println(arr2[1][1]);

    }
}



