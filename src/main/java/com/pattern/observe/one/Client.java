package com.pattern.observe.one;

/**
 * @author: yhl
 * @DateTime: 2020/6/28 22:57
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        ConcreteIdol cxk = new ConcreteIdol("cxk");
        ConcreteFan fanA = new ConcreteFan("张三");
        ConcreteFan fanB = new ConcreteFan("李四");
        ConcreteFan fanC = new ConcreteFan("王五");
        cxk.adFan(fanA);
        cxk.adFan(fanB);
        cxk.adFan(fanC);
        cxk.notifyFan("说：我会唱 跳 rap");
        System.out.println("--------------------------");
        cxk.delFan(fanB);
        cxk.notifyFan("说：鸡你太美");
    }
}
