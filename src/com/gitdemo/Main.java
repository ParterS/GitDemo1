package com.gitdemo;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota",2023,23500);
        Car car2 = new Car("Mazda",2022,24600);
        Car car3 = new Car("Honda",2023,28200);
        Car car4 = new Car("Honda",2023,28200);

    double totalCost = car1.getCost()+car2.getCost()+car3.getCost();
        System.out.println(totalCost);
    }
}
