import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileReadWrite {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\gunja\\intellij\\ISSAssigment\\src\\input.txt";
        String outputFilePath = "output.txt";
        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String filePath = "C:\\Users\\gunja\\intellij\\ISSAssigment\\src\\input1.txt";
        List<String> lines = Arrays.asList("Hi", "Java is an easy language.");
        try {
            List<String> readLines = Files.readAllLines(Paths.get(filePath));
            for (String line : readLines) {
                System.out.println(line);
            }
            Files.write(Paths.get(filePath), lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}