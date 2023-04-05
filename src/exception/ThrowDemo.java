package exception;

/**
 * 異常的拋出
 * throw關鍵字可以主動對外拋出一個異常
 * 通常下列情況我們會主動地拋出異常
 * 1.當前代碼片段出現異常，但不會在當前代碼片段解決，可以先將其拋出
 * 2.程序可以正常運行，但不滿足業務要求時，可以對外拋出
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setAge(100);//程序可運行，但不符合業務要求
        }catch (IllegalAgeException e) {
            e.printStackTrace();
        }
        System.out.println(p);

    }
}
