package lesson_12.task_1.for_each;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MethodsForEach {

    public static void evenNumbers(List<Integer> numbers) {
        for (int tmp : numbers) {
            if (tmp % 2 == 0) {
                System.out.print(tmp + " ");
            }
        }
    }

    public static void countLine(List<String> words) {
        int count = 0;
        for (String tmp : words) {
            if (tmp.length() > 5) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void minAndMax(List<Integer> nums) {
        int min = nums.getFirst();
        int max = nums.getFirst();

        for (int tmp : nums) {
            if (tmp < min) {
                min = tmp;
            }
            if (tmp > max) {
                max = tmp;
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void countAvgLine(List<String> names) {
        int allLines = 0;
        for (String tmp : names) {
            allLines += tmp.length();
        }
        System.out.println("Average line: " + allLines / names.size());
    }

    public static void sortAndDeleteDublicate(List<String> input) {
        List<String> newInput = new ArrayList<>();
        for (String tmp : input) {
            if (!newInput.contains(tmp)) {
                newInput.add(tmp);
            }
        }

        for (int i = 0; i < newInput.size() - 1; i++) {
            for (int j = 0; j < newInput.size() - 1 - i; j++) {
                if (newInput.get(j).length() > newInput.get(j + 1).length()) {
                    String temp = newInput.get(j);
                    newInput.set(j, newInput.get(j + 1));
                    newInput.set(j + 1, temp);
                }
            }
        }

        System.out.println(newInput);
    }

    public static void listToMap(List<String> fruits) {
        Map<String, Integer> newFruits = new HashMap<>();

        for (String tmp : fruits) {
            newFruits.put(tmp, tmp.length());
        }

        System.out.println(newFruits);
    }

    public static void groupNames(List<String> names) {
        Map<Character, List<String>> groupedNames = new HashMap<>();

        for (String name : names) {
            char firstLetter = Character.toUpperCase(name.charAt(0));

            if (!groupedNames.containsKey(firstLetter)) {
                groupedNames.put(firstLetter, new ArrayList<>());
            }

            groupedNames.get(firstLetter).add(name);
        }

        System.out.println(groupedNames);
    }

    public static void separateByCommas(List<String> names) {
        StringBuilder allNames = null;

        for (String tmp : names) {
            assert false;
            allNames.append(tmp).append(", ");
        }

        System.out.println(allNames);
    }

    public static void eachWord(List<String> sentence) {
        StringBuilder newSentence = null;

        for (String tmp : sentence) {
            assert false;
            newSentence.append(tmp).append(" ");
        }

        System.out.println(newSentence);
    }

    public static void searchTheRichestProduct(List<Test.Product> products) {
        Map<String, Test.Product> mostExpensiveByCategory = new HashMap<>();

        for (Test.Product product : products) {
            String category = product.category();

            if (!mostExpensiveByCategory.containsKey(category)) {
                mostExpensiveByCategory.put(category, product);
            } else {
                Test.Product existing = mostExpensiveByCategory.get(category);
                if (product.price() > existing.price()) {
                    mostExpensiveByCategory.put(category, product);
                }
            }
        }

        System.out.println(mostExpensiveByCategory);
    }
}
