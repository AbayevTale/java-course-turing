package az.edu.turing.module03.lesson2;

import java.util.Arrays;

public class ComparableDemo {


    public static void main(String[] args) {

        int[] arr = {10, 9, 1, 2, 5};
        Player[] players = getPlayers();

        System.out.println(Arrays.toString(players));

        Arrays.sort(players);
        System.out.println(Arrays.toString(players));


    }

    public static Player[] getPlayers() {
        return new Player[] {
                new Player("Bob", 97),
                new Player("Ali", 80),
                new Player("Jack", 90),
                new Player("John", 82),
        };
    }
}
