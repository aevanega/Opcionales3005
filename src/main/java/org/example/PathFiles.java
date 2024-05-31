    package org.example;

    import java.io.IOException;
    import java.nio.file.*;

    public class PathFiles {
        public static void main(String[] args) {
            Path filePath = Paths.get("FilePath/new 19.txt");

            if (Files.notExists(filePath)) {
                try {
                    Files.createDirectories(filePath.getParent());
                    Files.createFile(filePath);
                    System.out.println("Archivo y directorio creados.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("El archivo ya existe.");
            }
            Path userDirPath = Paths.get(System.getProperty("user.dir"));

            try {
                Files.list(userDirPath)
                        .filter(Files::isRegularFile)
                        .filter(path -> path.toString().endsWith(".txt"))
                        .forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
