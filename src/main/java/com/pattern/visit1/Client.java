package com.pattern.visit1;

/**
 * @author yhl
 * @Title: Client
 * @Description: TODO
 * @date 2019/6/21/021 23:08
 */
public class Client {

    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.add(new ConcreteElementA());
        objectStructure.add(new ConcreteElementB());

        // 访问者

        ConcreteVisitorA concreteVisitorA = new ConcreteVisitorA();
        objectStructure.accept(concreteVisitorA);

        // 访问者
        ConcreteVisitorB concreteVisitorB = new ConcreteVisitorB();
        objectStructure.accept(concreteVisitorB);

    }
}
