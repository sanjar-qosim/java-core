package lesson_2;

import java.util.Scanner;

public class Part2 {

    static Scanner scanner = new Scanner(System.in);

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
}
