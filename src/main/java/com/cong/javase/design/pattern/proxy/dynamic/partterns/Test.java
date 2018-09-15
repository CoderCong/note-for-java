package com.cong.javase.design.pattern.proxy.dynamic.partterns;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 759329342@qq.com
 * @since created  on  2018/9/1.
 * Description:
 */
public class Test {

    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        File file = new File(".");
        System.out.println(file.getCanonicalPath());
//        InputStream is = new FileInputStream(file.getCanonicalPath() + "\\target\\classes\\com\\cong\\javase\\proxy\\Programmer.class");
        InputStream is = new FileInputStream("D:/Programmer.class");
        byte[] bytes = new byte[1024];
        int read = is.read(bytes);
        MyClassLoader classLoader = new MyClassLoader();
        Class<?> cls = classLoader.defineMyClass(bytes, 0, read);
        Constructor<?> constructor = cls.getConstructor(null);
//        java.lang.ClassCastException: com.cong.javase.proxy.Programmer cannot be cast to com.cong.javase.proxy.Programmer
//        类加载器不同，类一定不同
//        Programmer instance = (Programmer) constructor.newInstance();
        Object instance =  constructor.newInstance();
        cls.getMethod("code",null).invoke(instance,null);

    }
}
