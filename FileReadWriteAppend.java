// WAP to read, write, append data in files
import java.io.*;

public class FileReadWriteAppend {
    public static void main(String[] args) {
        try {
            // Write
            FileWriter writer = new FileWriter("example.txt");
            writer.write("This is written to the file.\n");
            writer.close();

            // Append
            FileWriter append = new FileWriter("example.txt", true);
            append.write("This is appended.\n");
            append.close();

            // Read
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
