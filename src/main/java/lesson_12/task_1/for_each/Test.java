package lesson_12.task_1.for_each;

import java.util.List;

public class Test {

    record Product(String name, String category, double price) {}

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<String> words = List.of("apple", "banana", "pear", "pineapple");
        List<Integer> nums = List.of(10, 2, 33, 4, 25);
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        List<String> input = List.of("apple", "pear", "apple", "banana", "pear");
        List<String> fruits = List.of("apple", "banana", "kiwi");
        List<String> names2 = List.of("Tom", "Jerry", "Spike");
        List<String> sentences = List.of("Java is cool", "Streams are powerful");
        List<Product> products = List.of(
            new Product("Phone", "Electronics", 1200),
            new Product("TV", "Electronics", 1800),
            new Product("Apple", "Fruits", 2.5),
            new Product("Mango", "Fruits", 4.0)
        );

//        MethodsForEach.evenNumbers(numbers);
//        MethodsForEach.countLine(words);
//        MethodsForEach.minAndMax(nums);
//        MethodsForEach.countAvgLine(names);
//        MethodsForEach.sortAndDeleteDublicate(input);
//        MethodsForEach.listToMap(fruits);
//        MethodsForEach.groupNames(names);
//        MethodsForEach.separateByCommas(names2);
//        MethodsForEach.eachWord(sentences);
//        MethodsForEach.searchTheRichestProduct(products);
    }
}
