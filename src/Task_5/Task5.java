package Task_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("Введите строку ( пустая строка для окончания ввода) : ");
            String buffer = scanner.nextLine();
            if (buffer.isEmpty())
                break;
            else words.add(buffer);

            System.out.println("Введите число: ");
            numbers.add(Integer.valueOf(scanner.nextLine()));
        }
        Collections.sort(words);
        Collections.sort(numbers);
        Collections.reverse(numbers);

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
            System.out.println(numbers.get(i));
        }


    }
}
