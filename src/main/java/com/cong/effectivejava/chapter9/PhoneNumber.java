package com.cong.effectivejava.chapter9;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 759329342@qq.com
 * @since created  on  2017/12/25.
 */
public final class PhoneNumber {
    private final short areacode;

    private final short prefix;

    private final short lineNumber;

    public PhoneNumber(int areacode, int prefix, int lineNumber) {
        rangeCheck(areacode, 999, "area code");
        this.areacode = (short) areacode;
        this.prefix = (short)prefix;
        this.lineNumber = (short)lineNumber;
    }

    private void rangeCheck(int arg, int max, String name) {
        if(arg < 0 || arg > max){
            throw new IllegalArgumentException(name + ": " + arg);
        }
    }

    @Override
    public boolean equals(Object o) {
        if(o == this){
            return true;
        }
        if(o instanceof PhoneNumber){
            return false;
        }
        PhoneNumber pn = (PhoneNumber) o;
        return pn.areacode == areacode && pn.lineNumber == lineNumber && pn.prefix == prefix;
    }

//    @Override
//    public int hashCode() {
//        return 42;
//    }

    public static void main(String[] args) {
        Map<PhoneNumber, String> m = new HashMap<PhoneNumber, String>();
        PhoneNumber phoneNumber = new PhoneNumber(90, 123, 41);
        m.put(phoneNumber,"Jenny");
        String s = m.get(phoneNumber);
        System.out.println(s);
    }
}
