package lesson_5.quiz_system;

import java.util.ArrayList;
import java.util.List;

public class Team extends Player {

    private List<Player> teamMembers = new ArrayList<>();

    public Team(String name) {
        super(name);
    }

    public void addPlayer(String name) {
        teamMembers.add(new Player(name));
    }

    public void getTeamMembers() {
        for (Player tmp : teamMembers) {
            System.out.println(tmp);
        }
    }
}
