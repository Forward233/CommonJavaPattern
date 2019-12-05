package com.pattern.visit1;

/**
 * @author yhl
 * @Title: ConcreteElementA
 * @Description: TODO
 * @date 2019/6/21/021 22:52
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
