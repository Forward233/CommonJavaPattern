package com.pattern.description.two;

/**
 * @author: yhl
 * @DateTime: 2020/6/7 8:49
 * @Description: 可以不需要，功能是抽象属性    private final ICar car;
 */
public class DecoratorCar implements ICar{

    private final ICar car;

    public DecoratorCar(ICar car) {
        super();
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
