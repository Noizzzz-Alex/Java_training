/*
Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        int[] array_n = new int[]{5, 120, 57, 307, 56, 65, 684, 1869, 17};

        Sorting_Bubble.Bubble_Log(array_n);

        IntStream.range(0, array_n.length).forEach(i -> System.out.printf("%d, ", array_n[i]));

//
    }
}




