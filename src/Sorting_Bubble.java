import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Sorting_Bubble {
    public static void Bubble_Log(int[] array) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("log.txt");
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                out.printf("%s -> %s",array[i], array[i+1]);
                out.println();
                i = 0;
            }
        }
        out.close();
    }


}
