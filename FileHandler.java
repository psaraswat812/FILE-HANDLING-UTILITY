package JavaTasks.Task1;

import java.io.*;
import java.util.Scanner;

public class FileHandler {

    // This method writes some content to a new file
    public static void writeToFile(String filename, String content) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close(); // Always close the writer
            System.out.println("✅ Content written successfully to " + filename);
        } catch (IOException e) {
            // If something goes wrong while writing
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }
    }

    // This method reads content from a given file
    public static void readFromFile(String filename) {
        try {
            File file = new File(filename);
            Scanner reader = new Scanner(file);

            System.out.println("📄 Reading file content:");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line); // printing each line
            }

            reader.close(); // closing the scanner after reading
        } catch (FileNotFoundException e) {
            System.out.println("❌ File not found: " + filename);
        }
    }

    // This method appends content at the end of an existing file
    public static void appendToFile(String filename, String newData) {
        try {
            FileWriter writer = new FileWriter(filename, true); // true enables append mode
            writer.write("\n" + newData);
            writer.close();
            System.out.println("✅ Content appended successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error appending to file: " + e.getMessage());
        }
    }

    // Main method to test file operations
    public static void main(String[] args) {
        String fileName = "sample.txt";

        // This will overwrite if file already exists
        writeToFile(fileName, "Hello! This is the first line.");

        // Appending some more data
        appendToFile(fileName, "Now this is an extra line at the bottom.");

        // Finally, reading the file to show full content
        readFromFile(fileName);
    }
}