package lesson_2;

import java.util.Random;
import java.util.Scanner;

public class Part2 {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void switchNumber(){
        System.out.println("Please, enter two numbers:");
        int a = scanner.nextInt();
        System.out.println("First number is " + a);
        int b = scanner.nextInt();
        System.out.println("Second number is " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("The numbers were switched:\nFirst is: " + a + "\nSecond is: " + b);
    }

    public static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void converter(){
        System.out.println("Enter your amounts in dollars:");
        int a = scanner.nextInt();
        System.out.println("The " + a + "$ will be " + a * Exchange.USD.getCourse() + " in sums.");
    }

    public static void evenOrOdd(){
        System.out.println("Enter a number, please:");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }

    public static void maxNumber(){
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Please, enter the first number:");
                    break;
                case 1:
                    System.out.println("Please, enter the second number:");
                    break;
                case 2:
                    System.out.println("Please, enter the third number:");
                    break;

            }
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
        }

        System.out.println("The max number of yours is: " + max);
    }

    public static void calculate(){
        System.out.println("Please, enter first number:");
        int a = scanner.nextInt();
        System.out.println("Please, enter second number:");
        int b = scanner.nextInt();
        System.out.println("Please, enter the operation listed below:\n+\n-\n*\n/");
        char c = scanner.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println("Result: " + a + b);
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + a * b);
                break;
            case '/':
                System.out.println("Result: " + a / b);
                break;
            default:
                System.out.println("You entered the wrong operation!");
        }
    }

    public static void avgNumber(){
        System.out.println("Enter a number: ");
        int[] numbers = new int[0];
        int sum = 0;

        while (true) {
            System.out.println("Enter the number or enter the 'end' for stop cycle and watch to result:");
            String n = scanner.nextLine();
            if (n.equals("end")) {
                break;
            }
            int number = Integer.parseInt(n);
            int[] newNumbers = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                newNumbers[i] = numbers[i];
            }
            newNumbers[numbers.length] = number;
            numbers = newNumbers;
            sum += number;
        }

        System.out.println("The average value is: " + ((double) sum / numbers.length));
    }

    public static void searchNumber() {
        System.out.println("Enter a number: ");
        int[] numbers = new int[0];

        while (true) {
            System.out.println("Enter the number or enter the 'end' for stop cycle and watch to result:");
            String n = scanner.nextLine();
            if (n.equals("end")) {
                break;
            }
            int number = Integer.parseInt(n);
            int[] newNumbers = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                newNumbers[i] = numbers[i];
            }
            newNumbers[numbers.length] = number;
            numbers = newNumbers;
        }

        System.out.println("Enter the number which you want to check in array:");
        int target = scanner.nextInt();
        boolean isFound = false;

        for (int tmp : numbers) {
            if (tmp == target) {
                isFound = true;
            }
        }

        if (isFound) {
            System.out.println("Your number is in array!");
        } else {
            System.out.println("Your number was not found in array!");
        }
    }

    public static void guessTheNumber() {
        int randomNumber = random.nextInt(100);

        for (int i = 1; i < 4; i++) {
            System.out.println("Please, enter the number between 1-100\nYou have three chance");
            int usersNumber = scanner.nextInt();

            if (randomNumber == usersNumber) {
                System.out.println("Congratulations, you won!");
                break;
            }

            switch (i) {
                case 1:
                    System.out.println("You have two chance");
                    break;
                case 2:
                    System.out.println("You have one chance");
                    break;
                case 3:
                    System.out.println("Sorry, you don't have any chance");
            }
        }
    }
}
