package com.pattern.adapt.cobject;

import com.pattern.adapt.clazz.Adaptee;

/**
 * @author: yhl
 * @DateTime: 2020/8/31 14:21
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
