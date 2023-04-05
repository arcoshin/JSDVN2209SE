package collection.collection_4;

import java.util.Objects;

/**
 * p(x,y)
 * get、set
 * constructor、toString()、equal()
 */
public class Person_IV {
    private int x;
    private int y;

    public Person_IV(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Person_IV{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person_IV person_iv = (Person_IV) o;
        return x == person_iv.x &&
                y == person_iv.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
