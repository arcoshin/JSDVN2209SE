package io.io_2;

import java.io.Serializable;

public class Person_II implements Serializable {
    final static long serialVersionUID = 1L;
    private String name;
    private transient int age;
    private String like;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public Person_II(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
    }

    @Override
    public String toString() {
        return "Point_II{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", like='" + like + '\'' +
                '}';
    }
}
