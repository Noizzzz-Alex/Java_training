import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Reader {
    public static void ReaderContacts(File file,HashMap<String, String> map) {
        try {
            Scanner fileReader = new Scanner(file);
            int count = 1;
            while (fileReader.hasNextLine()) {

                String data = fileReader.nextLine();
                String[] temp = data.split(":");
                String name = temp[0];
                String number = temp[1];
                System.out.printf("""
                        Contact#%d
                        Name: %s
                        Numbers: %s""", count, name, number);
                count++;
                System.out.println();
                System.out.println("____________________");
                map.put(name,number);
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }


}
//Geralt:79456814565
//Vesemir:79451236545,79845613245