package com.company;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    Triangle(){
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }
    Triangle(double inputSide1,double inputSide2,double inputSide3){
        side1 = inputSide1;
        side2 = inputSide2;
        side3 = inputSide3;
    }
    double perimeter(){
        return (side1 + side2 + side3);
    }
    double area(){
        double semiperimeter = ((side1 +side2 + side3) * .5);
        double a = Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
        return (a);
    }
    double height(){
        double smallest = 1;
        if(side1 <= side2 && side1 <= side3){
            smallest = side1;
        }
        if(side2 <= side1 && side2 <= side3){
            smallest = side2;
        }
        if(side3 <= side2 && side3 <= side1){
            smallest = side3;
        }
        return ((area() * 2)/smallest);
    }
    String ToString(){
        return ("Triangle has sides " + side1 + ", " + side2 + " and " + side3 + ". It has an area of " + area() + " and perimeter of " + perimeter());
    }

}
