package pl.karkro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSize {

    public static void main(String[] args) {

        Path path = Paths.get("/home/karkro/IdeaProjects/W3Resource/src/pl/karkro/abc.txt");
        try {
            System.out.format("%s : %d bytes%n", path.toString(), Files.size(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
