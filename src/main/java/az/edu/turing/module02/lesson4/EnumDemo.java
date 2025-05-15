package az.edu.turing.module02.lesson4;

import az.edu.turing.module02.lesson4.enums.Card;

public class EnumDemo {

    public static void main(String[] args) {

        String name;

        String cardNumber = "8169741565656565";
        String substring = cardNumber.substring(0, 1);
        System.out.println(Card.getCardByNumber(substring));


        System.out.println(Card.UNION_PAY.getValue());
        System.out.println(Card.UNION_PAY.getName());




        for (Card card : Card.values()) {
            System.out.println(card + " " + card.ordinal());
        }
    }
}
