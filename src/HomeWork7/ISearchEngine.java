package HomeWork7;

public interface ISearchEngine {

//    2. Написать интерфейс ISearchEngine. Это будет функциональный интерфейс в котором будет метод search который будет
//    принимать два параметра (строку в котором мы ищем наше слово (книга), слово которое мы будем в нём искать),
//    а возвращать число (количество найденных совпадений).

    /**
     * Метод выполняет поиск подстроки <word> в строке <book>, и возвращает количество повторений
     * @param book строка в котрой выполяется поиск
     * @param word слово которое нужно найти
     * @return количество повторений искомого слова
     */
    public int search(String book, String word);
}
