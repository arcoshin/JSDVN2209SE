package io.io_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OISDemo_I {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("./demo/person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person_I person = (Person_I) ois.readObject();
        System.out.println(person);


    }
}
