import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            processFile(selectedFile);
        } else {
            System.out.println("No file selected.");
        }
    }

    private static void processFile(File file) {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                // Split the line into words and count the number of words
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            System.out.println("File Name: " + file.getName());
            System.out.println("Number of Lines: " + lineCount);
            System.out.println("Number of Words: " + wordCount);
            System.out.println("Number of Characters: " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
