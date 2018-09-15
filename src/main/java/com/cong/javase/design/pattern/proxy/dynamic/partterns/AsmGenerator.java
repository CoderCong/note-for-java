package com.cong.javase.design.pattern.proxy.dynamic.partterns;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.*;

/**
 * @author 759329342@qq.com
 * @since created  on  2018/9/1.
 * Description: ASM 生成类文件
 */
public class AsmGenerator {

    public static void main(String[] args) throws IOException {

        ClassWriter writer = new ClassWriter(0);
        writer.visit(Opcodes.V1_7,
                     Opcodes.ACC_PUBLIC,
                     "Programmer",
                     null,
                     "java/lang/Object",
                     null);
        //构造函数
        MethodVisitor mv = writer.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        mv.visitCode();
        mv.visitVarInsn(Opcodes.ALOAD,0);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL,"java/lang/Object","<init>","()V");
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(1, 1);
        mv.visitEnd();

        //定义code方法
        MethodVisitor code = writer.visitMethod(Opcodes.ACC_PUBLIC, "code", "()V", null, null);
        code.visitCode();
        code.visitFieldInsn(Opcodes.GETSTATIC,
                         "java/lang/System",
                        "out",
                        "Ljava/io/PrintStream;");
        code.visitLdcInsn("i'm asm create programmer");
        code.visitMethodInsn(Opcodes.INVOKESPECIAL,
                          "java/io/PrintStream",
                         "println",
                         "(Ljava/lang/String;)V");
        code.visitInsn(Opcodes.RETURN);
        code.visitMaxs(2,2);
        code.visitEnd();

        writer.visitEnd();

        // 使classWriter类已经完成
        // 将classWriter转换成字节数组写到文件里面去
        byte[] bytes = writer.toByteArray();

        File file = new File("D:/Programmer.class");
        OutputStream os = new FileOutputStream(file);
        os.write(bytes);
        os.close();


    }
}
