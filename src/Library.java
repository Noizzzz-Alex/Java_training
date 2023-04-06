import javax.lang.model.type.NullType;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Library {
    public static int Input_parse_int() {
        System.out.println("Введите первое число: ");
        Scanner sc_number_first = new Scanner(System.in);
        return Integer.parseInt(sc_number_first.nextLine());
    }

    public static char Input_action_char() {
        System.out.println("Действие(+, -, *, /): ");
        Scanner act = new Scanner(System.in);
        return act.next().charAt(0);
    }

    public static int RandomInt() {
        return (int) (Math.random() * 100);
    }

    public static int math_action(int first_number, char action, int number_two) throws FileNotFoundException {
        int result = 0;
        if (action == '+') {
            result = first_number + number_two;
        }
        if (action == '-') {
            result = first_number - number_two;
        }
        if (action == '*') {
            result = first_number * number_two;
        }
        if (action == '/') {
            result = first_number / number_two;
        }
        PrintWriter out = new PrintWriter("log.txt");
        out.printf("%s %c %s = %d", first_number, action, number_two, result);
        out.println();
        out.close();
        return result;

    }

    public static int[] RandomArray(int size_array, int up_random_limit) {
        Random random = new Random();
        int[] array = new int[size_array];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(up_random_limit);
        }
        return array;
    }

    public static void PrintArray(int[] array) {
        for (int j : array) {
            System.out.printf("%d, ", j);
        }
    }

    public static void merge(int[] array_1, int array1start,
                             int[] array_2, int array2start,
                             int[] dest, int destStart, int size) {
        int index1 = array1start;
        int index2 = array2start;

        int array1end = Math.min(array1start + size, array_1.length);
        int array2End = Math.min(array2start + size, array_2.length);

        int iterationCount = array1end - array1start + array2End - array2start;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < array1end && (index2 >= array2End || array_1[index1] < array_2[index2])) {
                dest[i] = array_1[index1];
                index1++;
            } else {
                dest[i] = array_2[index2];
                index2++;
            }
        }
    }

    public static ArrayList<Integer> RandomList(int size_list, int up_random_limit) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size_list; i++) {
            list.add(random.nextInt(up_random_limit));
        }
        return list;
    }

    public static LinkedList<Integer> Random_Linked_List(int size_list, int up_random_limit) {
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size_list; i++) {
            list.addFirst(random.nextInt(up_random_limit));
        }
        return list;
    }

    public static LinkedList<Integer> Linked_List_Back(LinkedList<Integer> older_list) {
        LinkedList<Integer> new_list = new LinkedList<>();
        for (int i = 0; i < older_list.size(); i++) {
            int temp = older_list.get(i);
            new_list.addFirst(temp);
        }
        return new_list;
    }

    public static void Linked_List_StartMenu(LinkedList<String> list) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (true) {
            System.out.println("Выберите пункт меню: ");
            System.out.println("_______________________________________");
            System.out.println("1 - поместить элемент в конец очереди");
            System.out.println("2 - вернуть первый элемент с удалением");
            System.out.println("3 - вернуть первый элемент без удаления");
            System.out.println("4 - выход");
            System.out.println("_______________________________________");
            str = sc.nextLine();
            if (str.equals("1")) {
                System.out.println("_________________________");
                System.out.println("Ожидание ввода элемента: ");
                System.out.println("_________________________");
                str = sc.nextLine();
                list.addLast(str);
            }
            if (str.equals("2")) {
                if (!list.isEmpty()) {
                    list.removeFirst();
                } else {
                    System.out.println("____________");
                    System.out.println("Список пуст!");
                    System.out.println("____________");
                }
            }
            if (str.equals("3")) {
                System.out.println(list.get(0));
            }
            if (str.equals("4")) {
                System.out.println("______________");
                System.out.println("Всего доброго!");
                System.out.println("______________");
                break;
            }
        }
    }

    public static void Calc_StartMenu(LinkedList<String> list) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int result = 0;
        while (!str.equals("6")) {
            System.out.println("Выберите действие: \n" +
                    "1 - Сложение\n" +
                    "2 - Вычитание\n" +
                    "3 - Умножение\n" +
                    "4 - Деление\n" +
                    "5 - Отмена\n" +
                    "6 - Выход");
            str = sc.nextLine();
            if (str.equals("1")) {
                System.out.println("Введите число(если нажмите Enter)");
                while (!str.isEmpty()) {
                    str = sc.nextLine();
                    if (str.isEmpty()) {
                        System.out.printf("result = %d", result);
                        System.out.println();
                    } else {
                        System.out.println("Введите число(если нажмите Enter)");
                        result += Integer.parseInt(str);
                    }
                }
                list.addLast(String.valueOf(result));
            }
            if (str.equals("2")) {
                System.out.println("Введите число(если нажмите Enter)");
                while (!str.isEmpty()) {
                    str = sc.nextLine();
                    if (str.isEmpty()) {
                        System.out.printf("result = %d", result);
                        System.out.println();
                    } else {
                        System.out.println("Введите число(если нажмите Enter)");
                        result -= Integer.parseInt(str);
                    }
                }
                list.addLast(String.valueOf(result));
            }
            if (str.equals("3")) {
                result = 1;
                System.out.println("Введите число(если нажмите Enter)");
                while (!str.isEmpty()) {
                    str = sc.nextLine();
                    if (str.isEmpty()) {
                        System.out.printf("result = %d", result);
                        System.out.println();
                    } else {
                        System.out.println("Введите число(если нажмите Enter)");
                        result *= Integer.parseInt(str);
                    }
                }
                list.addLast(String.valueOf(result));
            }
            if (str.equals("4")) {
                System.out.println("Введите число(если нажмите Enter)");
                while (!str.isEmpty()) {
                    str = sc.nextLine();
                    if (str.isEmpty()) {
                        System.out.printf("result = %d", result);
                        System.out.println();
                    } else {
                        System.out.println("Введите число(если нажмите Enter)");
                        result = Integer.parseInt(str);
                        result /= Integer.parseInt(str);
                    }
                }
                list.addLast(String.valueOf(result));
            }
            if (str.equals("5")) {
                System.out.println("Отмена ранее полученного результата");
                list.removeLast();
                result = Integer.parseInt(list.removeLast());
                System.out.printf("текущий результат = %s", result);
                System.out.println();
            }


        }
    }
}





