package files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileOutputWriterDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ALA", "OLA", "ADAM");
        // PrintWriter dekorator strumienia wyjściowego znakowego
        // FileWriter - konkretna klasa strumienia wyjściowego znakowego skojarzonego z plikiem
        try (PrintWriter writer = new PrintWriter(new FileWriter("E:\\JAVA - kurs\\JAVA - Zaawansowana\\Projects\\zdjavapol68-ja-jedi\\src\\main\\resources\\names.txt"))) {
            for (String name : names){
                writer.println(name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
