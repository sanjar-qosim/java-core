package lesson_3.StreetFighter;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
public class Fighter {

    private ArrayList<Fighter> fighters = new ArrayList<>();

    private static int codeCounter;
    private int code;
    private String name;
    private double health;
    private double attack;

    public Fighter(String name, double health, double attack) {
        codeCounter++;
        this.code = codeCounter;
        this.name = name;
        if (health > 0 && health < 100 && attack > 0 && attack < 100) {
            this.health = health;
            this.attack = attack;
        }
        fighters.add(this);
    }

    public void getFighters() {
        for (Fighter tmp : fighters) {
            System.out.println(tmp);
        }
    }

    public void getFighterInfo(int code) {
        for (Fighter tmp : fighters) {
            if (tmp.code == code) {
                System.out.println(tmp);
            }
        }
    }

    public void fight() {

    }

    @Override
    public String toString() {
        return "Fighter{" +
                "fighters=" + fighters +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                '}';
    }
}
