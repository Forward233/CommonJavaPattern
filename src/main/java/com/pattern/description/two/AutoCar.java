package com.pattern.description.two;

/**
 * @author: yhl
 * @DateTime: 2020/6/7 9:02
 * @Description:
 */
public class AutoCar extends DecoratorCar{

    public AutoCar(ICar car) {
        super(car);
    }

    public void swim() {
        System.out.println("功能+1：汽车可以自动驾驶啦");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}
