package exception.exception_3;

public class Person_III {
    private int age;

    public void setAge(int age) throws AgeOverRange {
        if (age > 120){
            throw new AgeOverRange("age > 120");
        } else if (age < 10) {
            throw new AgeOverRange("age < 10");
        } else {
            this.age = age;
        }
    }
}
