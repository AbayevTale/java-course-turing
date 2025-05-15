package az.edu.turing.module03.lesson2;

public class Player implements Comparable<Player> {

    private int score;
    private String name;


    public Player(String name, int score) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{score=%d, name='%s'}".formatted(score, name);
    }

    @Override
    public int compareTo(Player player) {
        return this.getName().length() - player.getName().length();
    }
}
