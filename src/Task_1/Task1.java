package Task_1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberLines = 10;
        List<String> inLines = new ArrayList<>();
        Map<Character, Integer> counterAlphabet = new HashMap<>();

        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        for (int i = 0; i < numberLines; i++) {
            System.out.println("Введите строку (осталось ввести " + (numberLines - i) +
                    " строк) : ");
            inLines.add(scanner.nextLine().replace(" ", "").toLowerCase());
        }

        for (int i = 0; i < numberLines; i++) {
            int lengthOfLine = inLines.get(i).length();
            for (int j = 0; j < lengthOfLine; j++) {
                Character symbol = inLines.get(i).charAt(j);
                if (counterAlphabet.containsKey(symbol)) {
                    counterAlphabet.put(symbol, counterAlphabet.get(symbol) + 1);
                } else counterAlphabet.put(symbol, 1);
            }
        }

        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " - " +
                    counterAlphabet.get(alphabet.get(i)));
        }

    }

}
