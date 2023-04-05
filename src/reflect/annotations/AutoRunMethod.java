package reflect.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 此註解類用於標記哪個方法需要被調用，需與@AutoRunClass註解配套使用
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AutoRunMethod {
    /**
     * 為註解添加參數的語法:
     * 類型 參數名(); //看起來很像方法，但其實是參數
     * 此處參數名是任意定義即可，但如只有一個參數，參數名建議使用value
     * 當註解中聲明參數時，外界使用注解時必須傳參(如同有參方法)，否則報錯
     * 參數只有一個時，而參數名非value時，傳參的格式:
     * @AutoRunMethod(num = 1) 註解名(參數名=參數值)
     * 參數只有一個時，而參數名為value時，傳參的格式:
     * @AutoRunMethod(value = 1) 註解名(參數名=參數值)
     * 或者參數名為value時，可以省略value
     * @AutoRunMethod(1) 註解名(參數名=參數值)
     * 當參數為多個時，不論是否為value，皆需傳入所有參數名，但順序無所謂
     * @AutoRunMethod 註解名(參數名1=參數值,參數名2=參數值......)
     * @AutoRunMethod(value=1,info="A",......)
     * @AutoRunMethod(info="A",value=1,......)
     *
     */
    int value() default 1;//當使用註解而不傳參時，默認設置為1

}
