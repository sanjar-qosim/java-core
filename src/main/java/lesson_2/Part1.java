package lesson_2;

import java.math.BigInteger;

public class Part1 {
    public static void print100(){
        for (int i = 1; i <= 100; i++) {
            System.out.print(" " + i);
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static void sumN(int n) {
        if (n < 0) {
            System.out.println("Invalid data!");
        } else {
            int result = 0;
            for (int i = 1; i <= n; i++) {
                result = result + i;
            }
            System.out.println(result);
        }
    }

    public static void multiplicationN(int n) {
        if (n < 0) {
            System.out.println("Invalid data!");
        } else {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            System.out.println(result);
        }
    }

    public static void sumEvenN(int n) {
        if (n < 0) {
            System.out.println("Invalid data!");
        } else {
            int result = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    result = result + i;
                }
            }
            System.out.println(result);
        }
    }

    public static void sumNumbers(int numbers) {
        //  This part I got from ChatGPT, because I couldn't make myself integer to array ((
        String tmp = String.valueOf(numbers);
        int[] numbersArray = new int[tmp.length()];
        for (int i = 0; i < tmp.length(); i++) {
            numbersArray[i] = Character.getNumericValue(tmp.charAt(i));
        }

        int result = 0;
        for (int num : numbersArray) {
            result = result + num;
        }
        System.out.println(result);
    }

    public static void reversalNumbers(int numbers) {
        //  This part I got from ChatGPT, because I couldn't make myself integer to array ((
        String tmp = String.valueOf(numbers);
        int[] numbersArray = new int[tmp.length()];
        for (int i = 0; i < tmp.length(); i++) {
            numbersArray[i] = Character.getNumericValue(tmp.charAt(i));
        }

        int left = 0;
        int right = numbersArray.length - 1;

        while (left < right) {
            int temp = numbersArray[left];
            numbersArray[left] = numbersArray[right];
            numbersArray[right] = temp;
            left++;
            right--;
        }

        for (int nmb : numbersArray) {
            System.out.println(nmb);
        }
    }

    // In this method I was informed, that I should use BigInt with working very big numbers
    public static void findFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid data!");
        } else {
            BigInteger result = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            System.out.println(result);
        }
    }

    public static void findFirstNumberWith7Division(int[] numbers) {
        int result = 0;
        for (int tmp : numbers) {
            if (tmp % 7 == 0 && tmp > 1000) {
                result = tmp;
                break;
            }
        }
        System.out.println(result);
    }

    public static void printPrimeNumbers(int[] numbers){
        for (int tmp : numbers) {
            if (tmp % 2 == 0) {
                continue;
            }

            boolean isPrime = true;

            for (int i = 3; i <= Math.sqrt(tmp); i += 2) {
                if (tmp % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(tmp);
            }
        }
    }

    public static void drawTriangle() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("\n");
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
