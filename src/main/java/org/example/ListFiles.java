package org.example;

import java.io.IOException;
import java.nio.file.*;

public class ListFiles {
    public static void main(String[] args) {
        try {
            Files.list(Paths.get(System.getProperty("user.dir")))
                    .filter(Files::isRegularFile)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
