package io.io_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSDemo_I {
    public static void main(String[] args) throws IOException {
        Person_I p = new Person_I("za", 18, "swim");
        FileOutputStream fos = new FileOutputStream("./demo/person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
        oos.close();

    }
}
