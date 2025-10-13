package lesson_3.StreetFighter;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Random;

@Getter
public class Fighter {

    private static ArrayList<Fighter> fighters = new ArrayList<>();

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

    public static void getFighters() {
        System.out.println("All fighters: ");
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

    public static void fight(Fighter fighter1, Fighter fighter2) {
        Random random = new Random();
        int round = 0;

        Fighter firstAttacker = null;
        Fighter secondAttacker = null;

        if (random.nextBoolean()) {
            firstAttacker = fighter1;
            secondAttacker = fighter2;
        } else {
            firstAttacker = fighter2;
            secondAttacker = fighter1;
        }

        System.out.println("The fight is beginning...");
        System.out.println(firstAttacker.name + " attacks first.\n");

        while (fighter1.health > 0 && fighter2.health > 0) {
            System.out.println("Round: " + ++round);

            secondAttacker.health -= firstAttacker.attack;
            System.out.println("The " + firstAttacker.name + " is attacking for " + firstAttacker.attack + " damage.\nThe " + secondAttacker.name + " health is " + secondAttacker.health);
            if (secondAttacker.health <= 0) {
                System.out.println("The " + firstAttacker.name + " is win!");
                break;
            }

            firstAttacker.health -= secondAttacker.attack;
            System.out.println("The " + secondAttacker.name + " is attacking for " + secondAttacker.attack + " damage.\nThe " + firstAttacker.name + " health is " + firstAttacker.health);
            if (firstAttacker.health <= 0) {
                System.out.println("The " + secondAttacker.name + " is win!");
                break;
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "fighters=" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                '}';
    }
}
