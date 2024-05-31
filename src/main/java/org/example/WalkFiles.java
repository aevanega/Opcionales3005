package org.example;

import java.io.IOException;
import java.nio.file.*;

public class WalkFiles {
    public static void main(String[] args) {
        try {
            Files.walk(Paths.get(System.getProperty("user.dir")))
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".txt"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
