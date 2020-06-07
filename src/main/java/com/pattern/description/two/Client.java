package com.pattern.description.two;

/**
 * @author: yhl
 * @DateTime: 2020/6/7 9:06
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        ICar car = new Car();
        FlyCar flyCar = new FlyCar(car);
        SwimCar swimCar = new SwimCar(flyCar);
//        AutoCar autoCar = new AutoCar(swimCar);
        swimCar.move();
    }
}
