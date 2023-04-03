import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Action {
    public static int math_action(int first_number,char action,int number_two) throws FileNotFoundException {
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
        out.printf("%s %c %s = %d",first_number, action,number_two,result);
        out.println();
        out.close();
        return result;
    }
}
