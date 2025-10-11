package lesson_8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParseUniqueInt {

    private final Set<Integer> numbers = new HashSet<>();
    private final Scanner scanner = new Scanner(System.in);

    public void addNumbers() {
        System.out.println("Please, enter any numbers:");
        String askUser = scanner.nextLine();

        String[] nmb = askUser.split(" ");

        for (String tmp : nmb) {
            try {
                int number = Integer.parseInt(tmp);
                this.numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        System.out.println("Unique numbers: " + numbers);
    }
}
