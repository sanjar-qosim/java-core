package lesson_12.task_1.stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MethodsStreamApi {

    public static void evenNumbers(List<Integer> numbers) {
        List<Integer> newNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .toList();
        System.out.println(newNumbers);
    }

    public static void countLine(List<String> words) {
        long count = words.stream()
            .filter(w -> w.length() > 5)
            .count();
        System.out.println(count);
    }

    public static void minAndMax(List<Integer> nums) {
        Optional<Integer> min = nums.stream()
            .min(Comparator.naturalOrder());

        Optional<Integer> max = nums.stream()
            .max(Comparator.naturalOrder());

        System.out.println("Min: " + min + "\nMax:" + max);
    }

    public static void countAvgLine(List<String> names) {
        OptionalDouble count = names.stream()
            .mapToInt(String::length)
            .average();

        System.out.println(count);
    }

    public static void sortAndDeleteDublicate(List<String> input) {
        List<String> newInput = input.stream()
            .distinct()
            .sorted(Comparator.comparingInt(String::length))
            .toList();
        System.out.println(newInput);
    }


}
