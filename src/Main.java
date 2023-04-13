import java.util.*;

public class Main {
    /*

    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    Создать множество ноутбуков.
    Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.

NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

    Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих

     */

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Asus", "15 D543MA-DM1368", 4, 1000, "Windows 10", "черный");
        Laptop laptop2 = new Laptop("Acer", "Aspire 3 A315-23-R0HR", 4, 256, "Windows 10", "черный");
        Laptop laptop3 = new Laptop("Lenovo", "IdeaPad 3 15IML05", 8, 1000, "Windows 11", "серый");
        Laptop laptop4 = new Laptop("MSI", "Modern 15 B11-002RU", 8, 256, "Windows 11", "черный");
        Laptop laptop5 = new Laptop("Asus", "VivoBook Pro 14 K3400PA-KP109", 16, 512, "Windows 10", "серебристый");
        Laptop laptop6 = new Laptop("MSI", "Summit E13 Flip Evo A12MT-061RU", 16, 512, "Без ОС", "серый");
        Laptop laptop7 = new Laptop("Huawei", "MateBook D16 RLEF-X", 16, 512, "Windows 10", "серый");
        Laptop laptop8 = new Laptop("Asus", "ROG Zephyrus G14 GA402RJ-L4045", 8, 1000, "Без ОС", "серый");
        Laptop laptop9 = new Laptop("MSI", "Raider GE78 HX 13VH-094RU", 32, 2000, "Windows 11", "черный");
        Laptop laptop10 = new Laptop("Apple", "MacBook Air", 8, 256, "macOS", "серый");

        HashSet<Laptop> notebooks = new HashSet<Laptop>(
                Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5,
                        laptop6, laptop7, laptop8, laptop9, laptop10));
        Library.Main_menu_Laptop(notebooks);

    }
}