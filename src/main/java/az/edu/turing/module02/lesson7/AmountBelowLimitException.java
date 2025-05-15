package az.edu.turing.module02.lesson7;

public class AmountBelowLimitException extends RuntimeException {


    public AmountBelowLimitException() {
        super("Amount below limit");
    }


}
