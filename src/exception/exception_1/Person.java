package exception.exception_1;

public class Person {
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    public void setAge(int age) throws AgeOutOfRange {
        if (age < 0 || age > 120) {
            throw new AgeOutOfRange("你輸入的年齡超過範圍");
        }
        this.age = age;
    }

    public Person() {
    }
}
