package com.cong.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 759329342@qq.com
 * @since created  on  2017/12/11.
 */
///在何处使用此注解
@Target({ElementType.TYPE ,ElementType.METHOD})
///注解使用的时期
/**
 * RetentionPolicy.SOURCE – 在编译阶段丢弃  @Override, @SuppressWarnings都属于这类注解
 * RetentionPolicy.CLASS – 在类加载的时候丢弃  注解默认使用这种方式
 * RetentionPolicy.RUNTIME– 始终不会丢弃，运行期也保留该注解，因此可以使用反射机制读取该注解的信息。
 *                          我们自定义的注解通常使用这种方式
 */
@Retention(RetentionPolicy.RUNTIME)

public @interface FirstAnnotation {

    public int id() default 0;

    public String name() default "";

    public int age() default 18;

    public String gender() default "M";


}
