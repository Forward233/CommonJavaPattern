package com.pattern.factroy.fact;

/**
 * @author yhl
 * @Title: Test
 * @Description: TODO
 * @date 2019/6/20/020 7:55
 */
public class Test {
    public static void main(String[] args) {
        Factory a = new FactoryA();
        a.createProduct();
        Factory b = new FactoryB();
        b.createProduct();

//        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
//        System.out.println(runtimeMXBean.getSpecName());
    }

}
