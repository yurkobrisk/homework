package HomeWork7;

public class StringMain1 {
    public static void main(String[] args) {

//        5. Вывести информацию как часто встречаются строки "война", "и" (как союз), "мир".
//        Написать два мэйн класса, в одном используем реализацию EasySearch, во втором RegExSearch.

//        6. В книге "Война и мир" найти все уникальные слова и поместить их в коллекцию используя Set

//        7. В книге "Война и мир" найти топ 10 слов и вывести количество количество этих слов используя Map.
//        Отсортировать по количеству. Распечатать в консоль. Пример: Война - 200 раз, Мир - 100 раз.......


        EasySearch easySearch = new EasySearch();
        int count = easySearch.search("Война и мир.Война и мир.Война и мир.", "война");
        System.out.println(count);

    }
}
