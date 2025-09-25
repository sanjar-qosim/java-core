package lesson_2;

public class Tasks2 {
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


    }

    public static void main(String[] args) {
//        Tasks2.print100();
//        Tasks2.sumN(10);
//        Tasks2.multiplicationN(3);
//        Tasks2.sumEvenN(4);
//        Tasks2.sumNumbers(1234);

    }
}
