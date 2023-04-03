import java.util.Scanner;

public class input_output {
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

}
