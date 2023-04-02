import java.io.File;

public class Library {

    public static boolean isFileExists(File file) {
        //проверят наличие файла и не является ли он каталогом
        /* пример кода
        String filePath = "log.txt"; - путь файла относительно проекта
        File file = new File(filePath);

        if (Library.isFileExists(file)) {
            System.out.println("File exists!!");
        } else {
            System.out.println("File doesn't exist");

        }
         */
        return file.exists() && !file.isDirectory();
    }


}
