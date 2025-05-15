package az.edu.turing.module02.lesson4;

public final class OrderStatus {

    public final static String ORDERED = "ORDERED";
    public final static String READY = "READY";
    public final static String DELIVERED = "DELIVERED";

    private OrderStatus() {}

    public static void checkOrderStatus(String status) {

        if (ORDERED.equalsIgnoreCase(status)) {
            System.out.println("will arrive in 30 min");
        } else if (READY.equalsIgnoreCase(status)) {
            System.out.println("will arrive in 15 min");
        } else if (DELIVERED.equalsIgnoreCase(status)) {
            System.out.println("Arrived");
        } else {
            System.out.println("Unknown status");
        }
    }

}
