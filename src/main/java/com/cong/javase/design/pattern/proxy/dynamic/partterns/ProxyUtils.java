package com.cong.javase.design.pattern.proxy.dynamic.partterns;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 759329342@qq.com
 * @since created  on  2018/9/3.
 * Description:
 */
public class ProxyUtils {
    /**
     *
     * 生成JDK代理类的class文件
     *
     * @param clazz  需要代理的类
     * @param proxyName  生成的动态代理的类名
     */
    public static void generateJdkProxyFile(Class clazz,String proxyName){

        byte[] proxyClass = ProxyGenerator.generateProxyClass(proxyName, clazz.getInterfaces());
        String paths = clazz.getResource(".").getPath();
        System.out.println(paths);
        try(FileOutputStream out = new FileOutputStream(paths + proxyName + ".class")){
            out.write(proxyClass);
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void generateCglibProxyFile(Class clazz, String jdkProxy$1234) {

    }

    public static void main(String[] args) {
        generateJdkProxyFile(TicketService.class,"JdkProxy$1234");
        generateCglibProxyFile(TicketService.class,"CglibProxy$1234");
    }

}
