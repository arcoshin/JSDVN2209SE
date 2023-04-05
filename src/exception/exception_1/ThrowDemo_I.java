package exception.exception_1;

public class ThrowDemo_I {
    public static void main(String[] args) {
        try {
            Person p = new Person();
            p.setAge(151);
        } catch (AgeOutOfRange ageOutOfRange) {
            ageOutOfRange.printStackTrace();
        }
    }
}
