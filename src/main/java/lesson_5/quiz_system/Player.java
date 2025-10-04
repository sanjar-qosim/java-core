package lesson_5.quiz_system;

public class Player {

    protected String name;
    protected int score = 0;

    public Player(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Player{" +
            "name='" + name + '\'' +
            ", score=" + score +
            '}';
    }
}
