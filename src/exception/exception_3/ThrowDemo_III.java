package exception.exception_3;

public class ThrowDemo_III {
    public static void main(String[] args) {
        Person_III p3 = new Person_III();
        try {
//            p3.setAge(121);
            p3.setAge(99);
            p3.setAge(9);
        } catch (AgeOverRange ageOverRange) {
            ageOverRange.printStackTrace();
        }


    }
}

