/*
Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.
 */


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
/*
Дана строка (получение через обычный текстовый файл!!!)

"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода в консоль:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Java Project\\untitled\\src\\task#2string.txt");
        FileReader reader = new FileReader(file);
        Scanner scanner = new Scanner(reader);
        String  line = scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < line.length(); i ++){
            if(line.charAt(i) != '"'){

                if(line.charAt(i) == ':'){
                    builder.append(',');

                }
                else{
                    builder.append(line.charAt(i));
                }
            }
        }
        reader.close();
        scanner.close();
        String [] array = builder.toString().split(",");
        System.out.println("Студент " + array[1] + " получил " + array[3] + " по предмету " + array[5] + ".");





    }
}




