//класс, содержащий логику решения задачи

import java.util.*;

public class Logic implements SearchWords, SortWords {
    private String[] arrayList = null;

    //метод по вводу строки, удаления в ней повторяемых слов и вывода в порядке возрастания их длины
    @Override
    public void inputRemoveRepeatsWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку текста");
        arrayList = scanner.nextLine().split(" ");
        TreeSet<String> wordList = new TreeSet<>(Arrays.asList(arrayList));
        System.out.println(wordList);
        String[] wordArray = wordList.toArray(new String[0]);
        Arrays.sort(wordArray, Comparator.comparing(String::length)); //сортировка строки по возрастанию их длины
        System.out.println("length-sorted: " + Arrays.toString(wordArray));
    }

    //метод подсчета повторений в изначально введенной строке
    @Override
    public void searchCountWords() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Input searching word");
        String searchWord = scanner1.nextLine();
        int count = 0;
        Map<String, Integer> wordToCount = new HashMap<>();
        for (String s : arrayList) {
            if (searchWord.equals(s)) {
                searchWord = s;
                count++;
            }
        }
        wordToCount.put(searchWord, count);
        System.out.println("Repetition: " + wordToCount);
    }

    //метод подсчета повторений всех слов введенной строки. Его нет в условиях задачи!!!
    public void countAllWords() {
        Map<String, Integer> wordToCount = new HashMap<>();
        for (String words : arrayList) {
            if (!wordToCount.containsKey(words)) {
                wordToCount.put(words, 0);
            }
            wordToCount.put(words, wordToCount.get(words) + 1);
        }
        for (String words : wordToCount.keySet()) {
            System.out.println(words + ": " + wordToCount.get(words));
        }
    }
}
