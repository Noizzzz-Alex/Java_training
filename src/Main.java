/*
Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.
 */

import java.io.FileNotFoundException;

public class Main {
    /*

     */

    public static void main(String[] args) throws FileNotFoundException {
        int first_number = input_output.Input_parse_int();
        char action = input_output.Input_action_char();
        int number_two = input_output.Input_parse_int();
        int result = Action.math_action(first_number,action,number_two);
        System.out.printf("%d %c %d = %d",first_number,action,number_two,result);

    }
}





