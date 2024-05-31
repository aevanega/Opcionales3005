package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordContador {
    public static void main(String[] args) {
        String filePath = "new 19.txt";
        int contador = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                contador += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Total number of words: " + contador);
    }
}
