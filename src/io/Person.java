package io;

import java.io.Serializable;

/**
 * 使用當前類來測試對象流的使用
 */
public class Person implements Serializable {
    /**
     * 在類中聲明一個靜態常量serialVersionUID
     * 固定一個值，那麼這個值成為當前類版本號
     * 不會隨著類的結構變化而再變化
     */
    static final long serialVersionUID = 42L;
    private String name;
    /**
     * 當一屬性非必要序列化時，可以添加transient忽略該屬性值
     */
    private transient int age;
    private String like;

    public String getSex() {
        return sex;
    }

    private String sex = "男性";//後加

    //快捷鍵生成構造器 "alt + insert"
    public Person(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", like='" + like + '\'' +
                '}';
    }
}
