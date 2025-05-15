package az.edu.turing.module03.lesson2;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {

    static Comparator<Player> scoreComparatorDesc =
            (player1, player2) -> player2.getScore() - player1.getScore();

    static Comparator<Player> nameComparatorAsc = Comparator.comparing(Player::getName);


    public static void main(String[] args) {

        Player[] players = getPlayers();
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, scoreComparatorDesc);
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, nameComparatorAsc);
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