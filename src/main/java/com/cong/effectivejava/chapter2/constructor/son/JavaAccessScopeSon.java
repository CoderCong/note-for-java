package com.cong.effectivejava.chapter2.constructor.son;

import com.cong.effectivejava.chapter2.constructor.DifferenceConstructorWithDiffParam;

/**
 * @author 759329342@qq.com
 * @since created  on  2017/11/24.
 */
public class JavaAccessScopeSon extends JavaAccessScope {

    public JavaAccessScopeSon() {
        this.publicName = "";
    }

    JavaAccessScope javaAccessScope = new JavaAccessScopeSon();


    public static void main(String[] args) {
        DifferenceConstructorWithDiffParam.getInstanceWithAgeFirst("",1);
    }
}
