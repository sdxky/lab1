import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PracticeSet {
    public static void task1() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5));

        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (Integer number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.println(uniqueNumbers);
    }

    public static boolean task2() {
        String name = "admin";
        HashSet<String> allowedUsers = new HashSet<>(Arrays.asList("admin", "user1", "guest"));

        return allowedUsers.contains(name);
    }

    public static void task3() {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // дубликат

        System.out.println(numbers.size());

        numbers.clear();

        System.out.println(numbers.isEmpty());
    }

    public static void task4() {
        HashSet<String> names = new HashSet<>(Arrays.asList("Alice", "Bob", "Charlie", "Diana", "Eve"));

        boolean removed = names.remove("Charlie");

        System.out.println(removed);
        System.out.println(names);
    }

    public static void task5() {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));

        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        set1.addAll(set2);

        System.out.println(set1);
    }

    public static void task6() {
        HashSet<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        HashSet<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 6));

        setA.removeAll(setB);

        System.out.println(setA);
    }

    public static void task7() {
        HashSet<Integer> setX = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        HashSet<Integer> setY = new HashSet<>(Arrays.asList(3, 4, 6));

        setX.retainAll(setY);

        System.out.println(setX);
    }

    public static void task8() {
        HashSet<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        HashSet<Integer> setB = new HashSet<>(Arrays.asList(2, 3));

        if (setA.containsAll(setB)) {
            System.out.println("Set A contains all elements of Set B.");
        } else {
            System.out.println("Set A does NOT contain all elements of Set B.");
        }
    }

    public static void task9() {
        String sentence = "Java is fun and Java is powerful";

        String[] words = sentence.split(" ");

        HashSet<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }

        System.out.println(uniqueWords);
    }

    public static void task10() {
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("Apple", "apple", "APPLE", "Banana", "BANANA")
        );

        HashSet<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }

        System.out.println(uniqueWords);
    }

}
