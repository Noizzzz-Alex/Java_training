import java.util.Scanner;

public class Main {
    /*
    Реализовать простой калькулятор (+ - / *)
    Ввод числа ->
    Ввод знака ->
    Ввод числа ->
     */

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner sc_number_first = new Scanner(System.in);
        //sc_number_first.close();
        int first_number = Integer.parseInt(sc_number_first.nextLine());

        System.out.println("Действие(+, -, *, /): ");
        Scanner act = new Scanner(System.in);
        //act.close();
        char action = act.next().charAt(0);

        System.out.println("Введите второе число: ");
        Scanner sc_number_two = new Scanner(System.in);
        //sc_number_two.close();
        int number_two = Integer.parseInt(sc_number_two.nextLine());

        int result;
        if (action == '+') {
            result = first_number + number_two;
            System.out.printf("Результат = %d ", result);
        }
        if (action == '-') {
            result = first_number - number_two;
            System.out.printf("Результат = %d ", result);
        }
        if (action == '*') {
            result = first_number * number_two;
            System.out.printf("Результат = %d ", result);
        }
        if (action == '/') {
            result = first_number / number_two;
            System.out.printf("Результат = %d ", result);
        }
    }
}



