package az.edu.turing.module02.lesson7;

public class CustomUncheckedException extends RuntimeException {

    //insufficient_balance

    public CustomUncheckedException() {
    }

    public CustomUncheckedException(String message) {
        super(message);
    }


}
