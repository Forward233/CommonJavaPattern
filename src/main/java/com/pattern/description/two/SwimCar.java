package com.pattern.description.two;

/**
 * @author: yhl
 * @DateTime: 2020/6/7 9:02
 * @Description:
 */
public class SwimCar implements ICar{
    private ICar car;

    public SwimCar(ICar car) {
        this.car = car;
    }

    public void swim() {
        System.out.println("功能+1：汽车可以游泳啦");
    }

    @Override
    public void move() {
        car.move();
        swim();
    }
}
