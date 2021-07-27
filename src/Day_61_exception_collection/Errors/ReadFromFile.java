package Day_61_exception_collection.Errors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        String filePath = "src/Day_61_exception_collection/Errors/data.txt";

            List<String> data = Files.readAllLines(Paths.get(filePath));
            System.out.println(data.get(0));
            for (String line : data){
                System.out.println(line);
            }


    }
}
