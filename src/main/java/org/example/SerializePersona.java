package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializePersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan Perez", 30, "Calle 41 sur");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.txt"))) {
            oos.writeObject(persona);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
