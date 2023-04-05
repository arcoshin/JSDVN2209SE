package exception.exception_2;

public class ThrowDemo_II {
    public static void main(String[] args) {
        Person_II zs = new Person_II(18);
        System.out.println(zs.getAge());
        try {
            //zs.setAge(-1);//報錯
            zs.setAge(123);//報錯
        } catch (UnCorrectAgeException e) {
            e.printStackTrace();
        }


    }
}

