package com.pattern.visit1;

/**
 * @author yhl
 * @Title: ConcreteVisitorA
 * @Description: TODO
 * @date 2019/6/21/021 22:56
 */
public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("ConcreteVisitorB------------>ConcreteElementA");
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("ConcreteVisitorB------------>ConcreteElementB");
    }
}
