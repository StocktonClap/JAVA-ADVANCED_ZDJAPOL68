package files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileInputReaderDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("E:\\JAVA - kurs\\JAVA - Zaawansowana\\Projects\\zdjavapol68-ja-jedi\\src\\main\\resources\\data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) ;
            System.out.println(line);
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku!");
        } catch (IOException e) {
            System.out.println("Błąd odczytu, brak danych");
        }
        for (String name : names) {
            System.out.println(name + ", ");
        }
        System.out.println("\b\b");
    }
}
