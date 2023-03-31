//Имеется текст, который задается с командной строки. Предположим, что в этом тексте не может быть знаков препинания.
// Все слова разделены пробелами.
// Необходимо вывести список всех слов без повторений в порядке возрастания длины.
// Далее при вводе слова из этого списка мы должны получить число, которое говорит сколько раз это слово встречается
// в оригинальном тексте.
// Обработайте ситуацию, когда вводим отсутствующее в списке слово.
// Все значение частотных характеристик слов вычисляются на этапе обработки текста и хранятся в отдельной структуре.
// Не забываем использовать интерфейсы и распределять реализацию по различным классам.

public class Test {
    public static void main(String[] args) {
        Logic logic = new Logic();
        logic.inputRemoveRepeatsWords();
        logic.searchCountWords();
        logic.countAllWords();
    }
}
