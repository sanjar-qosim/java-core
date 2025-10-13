package lesson_2;

import java.util.Scanner;

public class QuestGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(QuestTexts.firstText);

        int toSecondStep = scanner.nextInt();

        if (toSecondStep == 1) { // 2A
            System.out.println(QuestTexts.a2);
            int toThirdStep = scanner.nextInt();

            if (toThirdStep == 1) {  // 3A end
                System.out.println(QuestTexts.a3);
                System.out.println("Исчезновение, смерть"); // Неудача
            } else if (toThirdStep == 2) {  // 3B end
                System.out.println(QuestTexts.b3);
                System.out.println("Исчезновение, смерть"); // Неудача
            } else {
                System.out.println(QuestTexts.exit);
            }
        } else if (toSecondStep == 2) {   // 2B
            System.out.println(QuestTexts.b2);
            int toThirdStep = scanner.nextInt();

            if (toThirdStep == 1) { // 3C end
                System.out.println(QuestTexts.c3);
                System.out.println("Спасение, эвакуация"); // Победа
            } else if (toThirdStep == 2) {  // 3D end
                System.out.println(QuestTexts.d3);
                System.out.println("Попал под влияние озера"); // Проклятие озера
            } else {
                System.out.println(QuestTexts.exit);
            }
        } else if (toSecondStep == 3) {  // 2C
            System.out.println(QuestTexts.c2);
            int toThirdStep = scanner.nextInt();

            if (toThirdStep == 1) {  // 3E end
                System.out.println(QuestTexts.e3);
                System.out.println("Попал под влияние озера");  // Проклятие озера
            } else if (toThirdStep == 2) {  // 3F
                System.out.println(QuestTexts.f3);
                int toFourthStep = scanner.nextInt();

                if (toFourthStep == 1) { // A4 end
                    System.out.println(QuestTexts.a4);
                    System.out.println("Спас мир, но погиб");  // Герой
                } else if (toFourthStep == 2) {  // B4 end
                    System.out.println(QuestTexts.b4);
                    System.out.println("Стал частью эксперимента");  // Тайный участник
                } else {
                    System.out.println(QuestTexts.exit);
                }
            } else {
                System.out.println(QuestTexts.exit);
            }
        } else {
            System.out.println(QuestTexts.exit);
        }
    }
}
