package exception.exception_2;

public class Person_II {
    private int age;

    public Person_II(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Point_II{" +
                "age=" + age +
                '}';
    }

    public void setAge(int age) throws UnCorrectAgeException {
        if (age < 0 || age > 120) {
            throw new UnCorrectAgeException("年齡輸入錯誤");
        }
        this.age = age;
    }
}
