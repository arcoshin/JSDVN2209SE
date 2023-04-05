package reflect.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 該註解是用來標記那些類是需要掃描的，這樣可以避免掃描無用的類
 * 註解的關鍵字是@interface，這與接口並沒有任何關係
 * 定義註解時，一般都需要為自訂義註解使用兩個元註解加以修飾
 *  1.)@Retention 用來指定當前註解的保留級別，有三個可選值
 *      a)RetentionPolicy.SOURCE 表示當前註解僅在源碼中使用(極少使用)
 *      b)RetentionPolicy.CLASS 默認值，表示當前註解可以保存到字節碼中，但反射不可用
 *      c)RetentionPolicy.RUNTIME 表示當前註解可以保存到字節碼中，而反射也可用(一般使用此值)
 *  2.)@Target 用來表示當前註解可以使用的位置，如不指定則默認可使用任何位置，但一般都需指定
 *      a)ElementType.TYPE 可以在類上使用
 *      b)ElementType.FIELD 可以在屬性上使用
 *      c)ElementType.METHOD 可以在方法上使用
 *      d)ElementType.PARAMETER 可以在參數上使用
 *      e)...
 *      也可以傳入多個值 @Target({ElementType.FIELD,ElementType.TYPE})
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AutoRunClass {
//    @Retention(RetentionPolicy.RUNTIME)
//    @Target(ElementType.TYPE);
}
