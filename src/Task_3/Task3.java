package Task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {

        List<Integer> numbers = new ArrayList<>();
        int counter = 30;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < counter; i++) {
            System.out.println("Введите целое число (осталось ввести " + (counter - i) +
                    " чисел) : ");
            numbers.add(scanner.nextInt());
        }
        Collections.sort(numbers);
        System.out.println("Выводим все числа по возрастанию: ");
        numbers.forEach(System.out::println);
        System.out.println();
        System.out.println("10-e минимальное число - " + numbers.get(9));
        System.out.println("11-e минимальное число - " + numbers.get(10));

    }
}
