package lesson_12.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Task_2 {

    public static void main(String[] args) {
        Predicate<String> isValid = s -> s != null && s.length() > 3;
        System.out.println(isValid.test("Java"));
        System.out.println(isValid.test("Go"));


        Function<String, Integer> lengthFunc = String::length;
        System.out.println(lengthFunc.apply("Hello"));

        Supplier<UUID> uuidSupplier = UUID::randomUUID;
        System.out.println(uuidSupplier.get());
        System.out.println(uuidSupplier.get());

        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());
        printUpper.accept("hello world");

        BiFunction<Integer, Integer, Integer> sum = Integer::sum;
        System.out.println(sum.apply(5, 7));

        Function<String, String> trim = String::trim;
        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> trimThenUpper = trim.andThen(toUpperCase);
        System.out.println(trimThenUpper.apply("   java  "));

        Predicate<Integer> isOddOrNegative = getIntegerPredicate();
        System.out.println(isOddOrNegative.test(-3));
        System.out.println(isOddOrNegative.test(2));

        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        Function<Integer, String> toStr = x -> "Result: " + x;
        BiFunction<Integer, Integer, String> multiplyThenToStr = multiply.andThen(toStr);
        System.out.println(multiplyThenToStr.apply(3, 5));

        UnaryOperator<String> addExclamation = s -> s + "!!!";
        System.out.println(addExclamation.apply("Wow"));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = filter(numbers, n -> n % 2 == 0);
        System.out.println(evenNumbers);

        List<String> words = List.of("apple", "banana", "pear");
        List<Integer> lengths = map(words, String::length);
        System.out.println(lengths);

        forEach(words, w -> System.out.println("Word: " + w));

        List<UUID> uuids = generate(UUID::randomUUID, 3);
        System.out.println(uuids);
    }

    private static Predicate<Integer> getIntegerPredicate() {
        Consumer<String> printStr = System.out::println;
        Consumer<String> printLength = s -> System.out.println("Length: " + s.length());
        Consumer<String> combined = printStr.andThen(printLength);
        combined.accept("Functional");

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isPositive = n -> n > 0;
        return isEven.negate().or(isPositive.negate());
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
        List<R> result = new ArrayList<>();
        for (T item : list) {
            result.add(mapper.apply(item));
        }
        return result;
    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T item : list) {
            consumer.accept(item);
        }
    }

    public static <T> List<T> generate(Supplier<T> supplier, int n) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(supplier.get());
        }
        return result;
    }
}
