public class Action {
    public static int math_action(int first_number,char action,int number_two){
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
        return result;
    }
}
