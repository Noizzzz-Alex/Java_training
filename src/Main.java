/*
Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.
 */

import java.util.logging.Logger;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) {
        int[] array_n = new int[]{5, 120, 57, 307, 56, 65, 684, 1869, 17};
//        int k = array_n.length;
//        Logger log = Logger.getLogger("");
//        for (int i = 0; i < k - 1; i++) {
//            if (array_n[i] > array_n[i +1]){
//                int temp = array_n[i];
//                array_n[i] = array_n[i+1];
//                array_n[i+1] = temp;
//                i = 0;
//            }
//
//
//
//        }
        Sorting_Bubble.Bubble(array_n);
        IntStream.range(0, array_n.length).forEach(i -> System.out.printf("%d, ", array_n[i]));



    }
}




