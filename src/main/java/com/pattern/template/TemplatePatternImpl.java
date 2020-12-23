package com.pattern.template;

/**
 * @author: yhl
 * @DateTime: 2019/12/5 17:13
 * @Description:
 */
public class TemplatePatternImpl extends TemplatePattern {

    @Override
    public void method2() {
        System.out.println("钩子方法，父类默认实现，子类进行重写。");
    }

    @Override
    public void method3() {
        System.out.println("子类实现父类抽象方法，自定义逻辑。");
    }
}
