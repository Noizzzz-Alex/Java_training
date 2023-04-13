import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Reader {
    public static void ReaderContacts(File file, HashMap<String, String> map) {
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
                map.put(name, number);
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }

    public static void Reader_File(File file, LinkedList<String> temp_list) {
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                temp_list.add(data);

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }

    public static void filterRAM(HashSet<Laptop> notebooks, Scanner scanner) {
        TreeSet<Integer> ram = new TreeSet<>();
        for (Laptop note : notebooks) {
            ram.add(note.getRam());
        }
        System.out.println();
        System.out.println("Ноутбуки с оперативной памятью:  "
                + ram.toString().replaceAll("^\\[|\\]$", "") + " Гб\n" +
                "Введите интересующее значение: ");

        String oper = scanner.nextLine();
        int filter = Integer.parseInt(oper);
        if (ram.contains(filter)) {
            System.out.println();
            System.out.println("Модели по вашему запросу: ");
            System.out.println();
            for (Laptop note : notebooks) {
                if (note.getRam() == filter) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Ошибка ввода! Повторите ввод");
            filterRAM(notebooks, scanner);
        }
    }
    public static void FilterHardDisk(HashSet<Laptop> notebooks, Scanner scanner) {
        TreeSet<Integer> hardDisk = new TreeSet<>();
        for (Laptop note : notebooks) {
            hardDisk.add(note.getHardDisk());
        }
        System.out.println();
        System.out.println("Ноутбуки с объемом ПЗУ:  "
                + hardDisk.toString().replaceAll("^\\[|\\]$", "") + " Гб\n" +
                "Введите интересующее значение: ");

        String oper = scanner.nextLine();
        int filter = Integer.parseInt(oper);
        if (hardDisk.contains(filter)) {
            System.out.println();
            System.out.println("Модели по вашему запросу: ");
            System.out.println();
            for (Laptop note : notebooks) {
                if (note.getHardDisk() == filter) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Неправильное значение. Попробуйте снова");
            FilterHardDisk(notebooks, scanner);
        }
    }
    public static void filterOS(HashSet<Laptop> notebooks, Scanner scanner) {
        TreeSet<String> operSystems = new TreeSet<>();
        for (Laptop note : notebooks) {
            operSystems.add(note.getOperSystem());
        }
        System.out.println();
        System.out.println("Операционные системы: "
                + operSystems.toString().replaceAll("^\\[|\\]$", "") + "\n" +
                "Введите интересующую ОС: ");

        String oper = scanner.nextLine().toUpperCase();
        if (operSystems.contains(oper)) {
            System.out.println();
            System.out.println("Модели по вашему запросу: ");
            System.out.println();
            for (Laptop note : notebooks) {
                if (note.getOperSystem().equals(oper)) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Ошибка ввода! Повторите ввод");
            filterOS(notebooks, scanner);

        }
    }
    public static void filterColor(HashSet<Laptop> notebooks, Scanner scanner) {
        TreeSet<String> colors = new TreeSet<>();
        for (Laptop note : notebooks) {
            colors.add(note.getColor());
        }
        System.out.println();
        System.out.println("Ноутбуки следующих цветов: "
                + colors.toString().replaceAll("^\\[|\\]$", "") + "\n" +
                "Введите интересующий цвет: ");

        String oper = scanner.nextLine().toLowerCase();
        if (colors.contains(oper)) {
            System.out.println();
            System.out.println("модели по вашему запросу: ");
            System.out.println();
            for (Laptop note : notebooks) {
                if (note.getColor().equals(oper)) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Ошибка ввода! Повторите ввод");
            filterColor(notebooks, scanner);
        }
    }
}
