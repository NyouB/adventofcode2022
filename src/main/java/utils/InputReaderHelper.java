package utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class InputReaderHelper {


    public static Path getPath(String pathFromResourceRoot) {
        try {
            return Paths.get(ClassLoader.getSystemResource(pathFromResourceRoot).toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public static  List<String> readAllLines(String pathFromResourceRoot){
        try {
            return Files.readAllLines(InputReaderHelper.getPath(pathFromResourceRoot));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
