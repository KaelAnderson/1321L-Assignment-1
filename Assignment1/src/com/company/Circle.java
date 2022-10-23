package com.company;

public class Circle {
    private double radius;

    Circle(double inputRadius) {
        radius = inputRadius;
    }

    double circumference() {
        return (2 * Math.PI * radius);
    }
    double area(){
        return (Math.PI * (Math.pow(radius,2)));
    }
}
