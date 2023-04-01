import java.io.FileNotFoundException;
import java.io.IOException;

public class Sorting_Bubble {
    public static void Bubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {

                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = 0;
            }


        }
    }


}
