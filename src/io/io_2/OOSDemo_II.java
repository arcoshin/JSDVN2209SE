package io.io_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSDemo_II {
    public static void main(String[] args) throws IOException {
        Person_II p = new Person_II("zs",18,"swing");
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("./demo2/person.obj")
        );

        oos.writeObject(p);
        oos.close();

    }
}
