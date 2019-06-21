package com.pattern.visit1;

/**
 * @author yhl
 * @Title: Visiter
 * @Description: TODO
 * @date 2019/6/21/021 22:50
 */
public interface Visitor {
    void visit(ConcreteElementA concreteElementA);

    void visit(ConcreteElementB concreteElementB);
}
