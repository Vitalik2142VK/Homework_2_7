import java.util.*;

public class Main {

    public static void task1() {
        System.out.println("Task1:");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (final var value : nums) {
            if(value % 2 == 0) {
                System.out.print(value + " ");
            }
        }
        System.out.println("\n-----#####-----");
    }

    public static void task2() {
        System.out.println("Task2:");

        List<Integer> nums = new ArrayList<>(List.of(8, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums);
        Set<Integer> uniqueNums = new HashSet<>();
        for (final var value : uniqueNums) {
            if(value % 2 == 0)
                System.out.print(value + " ");
        }
        System.out.println("\n-----#####-----");
    }

    public static void task3() {
        System.out.println("Task3:");

        List<String> words = new ArrayList<>(List.of("кот", "собака", "попугай", "собака", "кот", "слон", "кот"));
        System.out.println("Уникальные слова:");
        String str = "";
        for (int i = 0; i < words.size(); i++) {
            boolean uniqueness = true;
            for (int j = 0; j < words.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (words.get(i).equalsIgnoreCase(words.get(j))) {
                    uniqueness = false;
                    break;
                }
            }
            if (uniqueness)
                str += words.get(i) + " | ";
        }
        if (str.length() == 0)
            System.out.println("\tУникальных слов нет.");
        else
            System.out.println("\t| " + str);

        System.out.println("\n-----#####-----");
    }

    public static void task4() {
        System.out.println("Task4:");

        List<String> words = new ArrayList<>(List.of("кот", "собака", "попугай", "собака", "кот", "слон", "кот"));
        Set<String> uniqueWords = new HashSet<>(words);

        System.out.println("Колличество повторений");
        String str = "";
        for (final var value : uniqueWords) {
            int repetitions = 0;
            for (String word : words) {
                if (value.equalsIgnoreCase(word)) {
                    repetitions++;
                }
            }
            if (repetitions > 1)
                str += value + " - " + repetitions + " | ";
        }
        if (str.length() == 0)
            System.out.println("\tПовторений нет.");
        else
            System.out.println("\t| " + str);

        System.out.println("\n-----#####-----");
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
}