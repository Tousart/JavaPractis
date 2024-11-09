package Lab13;

// привет тепло оправа арбуз заяц цирк клоп

import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Task6 {
    private static Set<String> usedWords = new HashSet<>();

    public static void main(String[] args) throws FileNotFoundException {
        // Создаем объект класса File
        String fileName = "C:/Users/HUAWEI/IdeaProjects/practis/src/Lab13/words.txt";
        File file = new File(fileName);

        // Считываем строку из файла в переменную line
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();

        String[] parts = line.split(" "); // Создаем список слов из строки line
        String result = getLine(parts); // Применяем метод getLine для получения искомой строки

        System.out.println(result);
    }

    private static String getLine(String[] parts) {
        StringBuilder result = new StringBuilder();

        if (parts.length == 0) return result.toString();

        findWord(result, parts[0], parts);
        return result.toString();
    }

    private static Boolean findWord(StringBuilder result, String word, String[] parts) {
        usedWords.add(word);
        Boolean found = false;

        for (String nextWord : parts) {
            if (!usedWords.contains(nextWord) && followWord(word, nextWord)) {
                found = true;

                if (found) result.append(word).append(" ");

                findWord(result, nextWord, parts); // !!!
            }
        }

        if (!found) {
            // Если слово может быть в цепочке и стоит последним
            if (followWord(result.substring(result.length() - 2, result.length() - 1), word)) {
                result.append(word);
            } else { // Иначе удаляем слово из множества и пробел из результата
                usedWords.remove(word);
                result.setLength(result.length() - 1);
            }
        }

        return false;
    }

    private static Boolean followWord(String word1, String word2) {
        return Character.toLowerCase(word1.charAt(word1.length() - 1)) ==
                Character.toLowerCase(word2.charAt(0));
    }
}
