package az.edu.turing.module02.lesson7;

public class ExceptionDemo {

    public static void main(String[] args) {

        System.out.println(divide(14, 1));
    }

    public static void divideAndPrintMessage(int a, int b) {

        int result = 0;
        try {
            result = divide(a, b);
        } finally {
            System.out.println(result);
        }
        System.out.println(result);


    }

    public static int divide(int a, int b) {

        int result = 0;
        try {
            return a/b;
        } catch (ArithmeticException e) {
            throw e;
        }finally {
            return result;
        }
    }
    //  message 0 1 (2)
    //    message  0 (1)

}
