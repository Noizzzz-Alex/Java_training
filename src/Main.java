
import java.util.ArrayList;
import java.util.Random;

public class Main {
    /*
    Задан целочисленный список ArrayList.
    Найти минимальное, максимальное и среднее ариф. из этого списка.
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random  = new Random();
        for(int i = 0; i <= 15; i ++){
            list.add(random.nextInt(100));
        }
        System.out.println("Дан список: \n" + list);
        int min = list.get(0);
        int max = list.get(0);
        double sum  = 0;
        for (int i = 0; i < list.size(); i ++){
            if(list.get(i) < min){
                min = list.get(i);
            }
            if(list.get(i) > max){
                max = list.get(i);
            }
            sum += list.get(i);
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное число: "+ max);
        System.out.println("Среднее арифметическое из списка: " + sum/list.size());


    }
}