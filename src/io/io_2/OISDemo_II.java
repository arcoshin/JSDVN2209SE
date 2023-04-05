package io.io_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OISDemo_II {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("./demo2/person.obj")
        );

        Person_II p = (Person_II) ois.readObject();
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getLike());
        ois.close();

    }
}
