package lesson_3.StreetFighter;

import java.util.Random;

public class FightNight {

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Viper", 65.5, 5);
        Fighter fighter2 = new Fighter("Lina", 52.4, 9);

        Fighter.getFighters();
        System.out.println();

        fighter1.getFighterInfo(1);
        fighter2.getFighterInfo(2);

        Fighter.fight(fighter1, fighter2);
    }
}
