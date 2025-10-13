package lesson07;

import java.util.Scanner;

public class TestAirplane {
    public static void main(String[] args) {
        AirplaneController airplane = new AirplaneController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Show all seats");
            System.out.println("2. Order the seat");
            System.out.println("3. Confirm the seat");
            System.out.println("4. Cancel the seat");
            System.out.println("5. Information about seat");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> airplane.showAllSeats();
                case "2" -> {
                    System.out.print("Write a number of seat: ");
                    int num = Integer.parseInt(scanner.nextLine());
                    System.out.print("Write your name: ");
                    String name = scanner.nextLine();
                    airplane.holdSeat(num, name);
                }
                case "3" -> {
                    System.out.print("Write a number of seat: ");
                    int num = Integer.parseInt(scanner.nextLine());
                    airplane.confirmSeat(num);
                }
                case "4" -> {
                    System.out.print("Write a number of seat: ");
                    int num = Integer.parseInt(scanner.nextLine());
                    airplane.cancelBooking(num);
                }
                case "5" -> {
                    System.out.print("Write a number of seat: ");
                    int num = Integer.parseInt(scanner.nextLine());
                    airplane.findBooking(num);
                }
                case "6" -> {
                    System.out.println("Exit...");
                    return;
                }
                default -> System.out.println("Invalid data!");
            }
        }
    }
}
