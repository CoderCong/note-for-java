package com.cong.javase.design.pattern.proxy.dynamic.partterns;

import javassist.*;

import java.io.IOException;

/**
 * @author 759329342@qq.com
 * @since created  on  2018/9/3.
 * Description:
 */
public class JavassistGenerator {
    public static void main(String[] args) throws CannotCompileException, NotFoundException, IOException {
        ClassPool classPool = ClassPool.getDefault();
        CtClass ctClass = classPool.makeClass("com.cong.Programmer");
        CtMethod ctMethod = CtNewMethod.make("public void code(){}",ctClass);
        ctMethod.insertBefore("System.out.println(\"Javassist coding\");");
        ctClass.addMethod(ctMethod);
        ctClass.writeFile("D:/");
    }
}
