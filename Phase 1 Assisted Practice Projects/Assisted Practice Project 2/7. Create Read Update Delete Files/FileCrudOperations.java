package dom;

import java.io.*;

public class FileCrudOperations {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Create a file
        createFile(filePath);

        // Read from the file
        readFile(filePath);

        // Update the file
        updateFile(filePath, "Updated content");

        // Read again after updating
        readFile(filePath);

        // Delete the file
        deleteFile(filePath);
    }

    private static void createFile(String filePath) {
        try {
            File file = new File(filePath);

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    private static void readFile(String filePath) {
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            System.out.println("File content:");

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    private static void updateFile(String filePath, String content) {
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(content);

            bufferedWriter.close();
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file.");
            e.printStackTrace();
        }
    }

    private static void deleteFile(String filePath) {
        try {
            File file = new File(filePath);

            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while deleting the file.");
            e.printStackTrace();
        }
    }
}

