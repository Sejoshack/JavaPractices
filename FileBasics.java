import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileBasics {
    public static void main(String[] args) {
        String fileName = "student.txt";

        // 1. WRITING TO THE FILE
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello Java!\n");
            writer.write("Writing to files is easier than it looks.\n");
            writer.write("I have just made my first trial today.");
            System.out.println("Successfully wrote to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing.");
            e.printStackTrace();
        }

        System.out.println("--- Reading back the contents ---");

        // 2. READING FROM THE FILE
        try (Scanner reader = new Scanner(new File(fileName))) {
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading.");
            e.printStackTrace();
        }
    }
}