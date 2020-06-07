package com.pattern.description.two;

/**
 * @author: yhl
 * @DateTime: 2020/6/7 9:02
 * @Description:
 */
public class FlyCar implements ICar{
    private ICar car;

    public FlyCar(ICar car) {
        this.car = car;
    }

    public void fly() {
        System.out.println("功能+1：汽车可以飞啦");
    }

    @Override
    public void move() {
        car.move();
        fly();
    }
}
