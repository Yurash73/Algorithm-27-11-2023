package Task_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку ( пустая строка для окончания ввода) :");
            String buffer = scanner.nextLine().trim();
            if (buffer.isEmpty())
                break;
            System.out.println("Введите число: ");
            Integer tempInteger = Integer.valueOf(scanner.nextLine());
            map.put(buffer, tempInteger);
        }

        map.forEach((k, v) -> System.out.println(v + " - " + k));
    }
}
