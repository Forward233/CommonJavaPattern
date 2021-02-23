package com.pattern.singleton;

/**
 * @author: yhl
 * @DateTime: 2020/12/29 7:49
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        SingletonOne singletonOneA = SingletonOne.getSingletonOne();
        SingletonOne singletonOneB = SingletonOne.getSingletonOne();

        System.out.println(singletonOneA);
        System.out.println(singletonOneB);

        SingletonEnum singletonEnumA = SingletonEnum.getSingletonEnum();
        SingletonEnum singletonEnumB = SingletonEnum.getSingletonEnum();
        System.out.println(singletonOneA == singletonOneB);
    }
}
