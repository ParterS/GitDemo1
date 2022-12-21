package com.gitdemo;
public class Car{
    String brand;
    int year;
    double cost;

    public Car(String brand, int year, double cost) {
        this.brand = brand;
        this.year = year;
        this.cost = cost;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", cost=" + cost +
                '}';
    }

}
