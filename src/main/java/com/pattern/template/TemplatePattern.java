package com.pattern.template;

/**
 * @author: yhl
 * @DateTime: 2019/12/5 17:09
 * @Description:  抽象模板类
 * 算法的流程执行顺序是由父类掌控的，子类只能配合。
 * reference ：[Spring JdbcTemplate源码深度剖析 - 瘦子没有夏天 - CSDN博客](https://blog.csdn.net/weixin_39723544/article/details/79907375)
 */
public abstract class TemplatePattern {

    public final void  templateMethod(){
        method1();
        // 钩子方法
        method2();
        // 抽象方法
        method3();
    }

    private void method1(){
        System.out.println("父类业务逻辑");
    }

    public void method2() {
        System.out.println("钩子方法，父类默认实现，子类可重写");
    }

    /**
     * 抽象方法，子类实现
     */
    public abstract void method3();

}
