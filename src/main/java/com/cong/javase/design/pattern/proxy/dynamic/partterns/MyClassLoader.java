package com.cong.javase.design.pattern.proxy.dynamic.partterns;

import java.net.URL;

/**
 * @author 759329342@qq.com
 * @since created  on  2018/9/1.
 * Description:
 */
public class MyClassLoader extends ClassLoader {

    public Class<?> defineMyClass(byte[] b, int off, int len) {
        return super.defineClass(b, off, len);
    }
}
