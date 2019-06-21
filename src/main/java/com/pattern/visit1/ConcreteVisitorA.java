package com.pattern.visit1;

/**
 * @author yhl
 * @Title: ConcreteVisitorA
 * @Description: TODO
 * @date 2019/6/21/021 22:56
 */
public class ConcreteVisitorA implements Visitor {


    @Override
    public void visit(ConcreteElementA concreteElementA) {
        // 对ConcreteElementA执行操作
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        // 对ConcreteElementB执行操作
    }
}
