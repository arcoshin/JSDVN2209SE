package exception;

/**
 * 此類用以測試異常拋出
 */
public class  Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if (age < 0 || age > 100) {
//            System.out.println("輸入年齡不合法");
            //此處發生了校驗問題，直接將問題打印給控制台
            //throw new RuntimeException("您輸入的年齡不合法");
//            throw new Exception("您輸入的年齡不合法");
            throw new IllegalAgeException("您輸入的年齡不合法");
            /**
             * java中除了RuntimeException之外
             * 其他的異常在throw拋出後，編譯器都要求必須
             * 在"方法"上使用throws關鍵字聲明該異常的拋出
             */
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "此人年齡為:" + age + "歲!";
    }
}
