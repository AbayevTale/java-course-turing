package az.edu.turing.module02.lesson4.enums;

public enum Card {

    VISA("4", "visa"),
    MASTERCARD("5", "master"),
    UNION_PAY("6", "upi");

    private String value;
    private String name;

    Card(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static Card getCardByNumber(String number) {
        for (Card card : Card.values()) {
            if (card.value.equals(number)) {
                return card;
            }
        }
        return null;
    }
}
