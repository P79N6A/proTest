package myAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyTag {
    String name() default "hobe"; //字符串
    int age() default 18;  //int
    String[] likes(); // 数组
    Sex sex() default Sex.BOY; //枚举
}
