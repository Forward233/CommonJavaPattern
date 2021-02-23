package com.pattern.singleton;

/**
 * @author: yhl
 * @DateTime: 2021/2/20 10:02
 * @Description:
 */
public class SingletonEnum {

    private SingletonEnum() {
    }

    public enum Singleton {
        SINGLETON;
        private final SingletonEnum singletonEnum;

        Singleton(){
            singletonEnum = new SingletonEnum();
        }

        private SingletonEnum getSingletonEnum(){
            return singletonEnum;
        }
    }

    public static SingletonEnum getSingletonEnum() {
        return Singleton.SINGLETON.getSingletonEnum();
    }
}
