package com.cong.effectivejava.chapter2.constructor.son;

/**
 * @author 759329342@qq.com
 * @since created  on  2017/11/24.
 */
public class JavaAccessScope {
    private String privateName;
    protected String protectedName;
    public String publicName;

    private  String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }

    public String getProtectedName() {
        return protectedName;
    }

    public void setProtectedName(String protectedName) {
        this.protectedName = protectedName;
    }

    public String getPublicName() {
        return publicName;
    }

    public void setPublicName(String publicName) {
        this.publicName = publicName;
    }

    public static void main(String[] args) {
        Boolean.valueOf("false");
    }
}
