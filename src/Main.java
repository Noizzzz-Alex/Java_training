
import java.util.LinkedList;


public class Main {
    /*
    Пусть дан LinkedList с несколькими элементами.
    Реализуйте метод(не void), который вернет “перевернутый” список.
     */

    public static void main(String[] args) {
        LinkedList<Integer> ll = Library.Random_Linked_List(15, 30);
        System.out.println(ll);
        LinkedList<Integer> new_ll = Library.Linked_List_Back(ll);
        System.out.println(new_ll);



    }
}