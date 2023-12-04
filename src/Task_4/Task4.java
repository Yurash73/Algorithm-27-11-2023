package Task_4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String vowels = "аяуюиыэеоё";

        String onlyVowelsToOut = "";
        String onlyConconantsToOut = "";

        System.out.println("Введите строку текста для обработки:");
        String inLine = scanner.nextLine();
        inLine.replace(" ", "");

        for (int i = 0; i < inLine.length(); i++) {
            char tempChar = inLine.toLowerCase().charAt(i);
            if (vowels.contains(String.valueOf(tempChar))) {
                onlyVowelsToOut += tempChar + " ";
            } else onlyConconantsToOut += tempChar + " ";
        }

        onlyVowelsToOut += " ";
        onlyConconantsToOut += " ";

        System.out.println("Строка с гласными буквами: \n " + onlyVowelsToOut);
        System.out.println("Строка с согласными буквами: \n " + onlyConconantsToOut);
    }
}
