package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

@AutoRunClass
public class Person {
    private String name = "張三";
    private int age = 22;

    //無參構造&全參構造
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @AutoRunMethod(1)
    public void sayHello() {
        System.out.println(name + ":hello!!");
    }
    @AutoRunMethod(1)
    public void sayHi() {
        System.out.println(name + ":hi!!");
    }

    public void sayGoodBye() {
        System.out.println(name + ":bye!!");
    }

    public void dosome(String thing) {
        System.out.println(name + "正在" + thing);
    }

    public void dosome(String thing, int sum) {
        for (int i = 0; i < sum; i++) {
            System.out.println(name + "正在" + thing);
        }
    }

    private void secret() {
        System.out.println(name + ":這是我的私有方法!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}