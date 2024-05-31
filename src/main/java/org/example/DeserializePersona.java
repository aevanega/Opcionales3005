package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializePersona {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.txt"))) {
            Persona persona = (Persona) ois.readObject();
            System.out.println("Deserialized Persona: " + persona);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
