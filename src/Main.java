import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task12();

    }

    private static void task1() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Harry Potter");
        list1.add("Pride and Prejudice");
        list1.add("The Hobbit");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("The Hobbit");
        list2.add("War and Peace");
        list2.add("Harry Potter");


        ArrayList<String> mergedList = new ArrayList<>(list1);

        for (String book : list2) {
            if (!mergedList.contains(book)) {
                mergedList.add(book);
            }
        }

        System.out.println(mergedList);
    }

    private static void task2() {
        ArrayList<String> movies = new ArrayList<>();

        movies.add("Inception");
        movies.add("The Lord of the Rings: The Return of the King");
        movies.add("Interstellar");
        movies.add("Avatar");
        movies.add("Pirates of the Caribbean: The Curse of the Black Pearl");

        String longest = "";

        for (String title : movies) {
            if (title.length() > longest.length()) {
                longest = title;
            }
        }

        System.out.println("Longest movie title: " + longest);
        System.out.println("Length: " + longest.length());
    }

    private static void task3() {

        ArrayList<String> foods = new ArrayList<>();

        foods.add("Burger");
        foods.add("Pizza");
        foods.add("Pasta");
        foods.add("Pizza");
        foods.add("Salad");
        foods.add("Pizza");

        int count = 0;

        for (String food : foods) {
            if (food.equals("Pizza")) {
                count++;
            }
        }

        System.out.println("\nPizza appears " + count + " times in the list.");
    }

    private static void task4() {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana");

        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals("Banana")) {
                fruits.remove(i);
                i--;
            }
        }

        System.out.println("\nFruits after removing Banana: " + fruits);
    }

    private static void task5() {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("White");

        for (int i = 0; i < colors.size(); i++) {
            colors.set(i, "Black");
        }

        System.out.println("Colors after replacement: " + colors);
    }

    private static void task6() {
        ArrayList<String> sports = new ArrayList<>();
        sports.add("Basketball");
        sports.add("Football");
        sports.add("Cricket");
        sports.add("Tennis");
        sports.add("Hockey");

        ArrayList<String> smallList = new ArrayList<>();
        smallList.add("Football");
        smallList.add("Tennis");

        if (sports.containsAll(smallList)) {
            System.out.println("The sports list contains all elements of the smaller list.");
        } else {
            System.out.println("The sports list does NOT contain all elements of the smaller list.");
        }
    }

    private static void task7() {
        ArrayList<String> flowers = new ArrayList<>();

        flowers.add("Lily");
        flowers.add("Rose");
        flowers.add("Tulip");
        flowers.add("Sunflower");
        flowers.add("Rose");
        flowers.add("Daisy");
        flowers.add("Rose");

        int firstIndex = flowers.indexOf("Rose");
        int lastIndex = flowers.lastIndexOf("Rose");

        if (firstIndex != -1) {
            System.out.println("First index of Rose: " + firstIndex);
            System.out.println("Last index of Rose: " + lastIndex);
        } else {
            System.out.println("Rose is not found in the list.");
        }
    }

    private static void task8() {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Tiger");
        animals.add("Dog");

        for (int i = 0; i < animals.size(); i++) {
            for (int j = i + 1; j < animals.size(); j++) {
                if (animals.get(i).equals(animals.get(j))) {
                    animals.remove(j);
                    j--;
                }
            }
        }
        System.out.println("ArrayList after removing duplicates: " + animals);
    }

    private static void task9() {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Bishkek");
        cities.add("Osh");
        cities.add("Almaty");
        cities.add("Tashkent");
        cities.add("Astana");

        String[] cityArray = new String[cities.size()];
        cities.toArray(cityArray);

        System.out.println("ArrayList: " + cities);
        System.out.println("Array: " + Arrays.toString(cityArray));
    }

    private static void task10() {
        int[] numbers = {10, 20, 30, 40, 50};

        ArrayList<Integer> numberList = new ArrayList<>();

        for (int num : numbers) {
            numberList.add(num);
        }

        System.out.println("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nArrayList: " + numberList);
    }

    private static void task11() {
        ArrayList<String> countries1 = new ArrayList<>();
        countries1.add("Great Britain");
        countries1.add("USA");
        countries1.add("China");
        ArrayList<String> countries2 = new ArrayList<>();
        countries2.add("USA");
        countries2.add("Kyrgyzstan");
        countries2.add("Russia");

        ArrayList<String> commonCountries = new ArrayList<>();

        for (String country : countries1) {
            for (String country2 : countries2) {
                if (country.equals(country2)) {
                    commonCountries.add(country);
                }
            }
        }

        System.out.println("Common countries: " + commonCountries);
    }

    private static void task12() {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Julie", "Eldar", "Azamat"));
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).length() % 2 == 0){
                names.remove(i);
            }
        }
        System.out.println("ArrayList after removing even length names: " + names);
    }

    private static void task13() {

    }
}