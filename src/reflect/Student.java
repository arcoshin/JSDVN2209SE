package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

@AutoRunClass
public class Student {
    @AutoRunMethod(1)
    public void study(){
        System.out.println("學生:好好學習，天天向上!");
    }
    @AutoRunMethod(3)
    public void playGame(){
        System.out.println("學生:好好遊戲，才好學習");
    }
}
