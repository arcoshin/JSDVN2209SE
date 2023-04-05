package io.io_1;

import java.io.Serializable;

public class Person_I implements Serializable {
    private String name;
    private transient int age;
    private String like;

    @Override
    public String toString() {
        return "Person_I{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", like='" + like + '\'' +
                '}';
    }

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

    public Person_I(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
    }
}
