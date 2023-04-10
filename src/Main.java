
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;


public class Main {
    /*
    Пусть дан список сотрудников:
    Иван Иванов
    Светлана Петрова
    Кристина Белова
    Анна Мусина
    Анна Крутова
    Иван Юрин
    Петр Лыков
    Павел Чернов
    Петр Чернышов
    Мария Федорова
    Марина Светлова
    Мария Савина
    Мария Рыкова
    Марина Лугова
    Анна Владимирова
    Иван Мечников
    Петр Петин
    Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся имена
с количеством повторений.
Отсортировать по убыванию популярности Имени.
     */

    public static void main(String[] args) {
        File file = new File("D:\\Java Project\\untitled\\src\\List.txt");
        LinkedList<String> employers = new LinkedList();
        HashMap<String, Integer>names = new HashMap<String, Integer>();
        Reader.Reader_File(file,employers);
        Library.Counter_Names(employers,names);
        Library.Sorted_Names(names);


    }
}