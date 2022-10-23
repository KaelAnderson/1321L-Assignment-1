package com.company;

public class Rectangle {
    private double height;
    private double width;
    Rectangle(double inputHeight, double inputWidth){
        height = inputHeight;
        width = inputWidth;
    }
    double perimeter(){
        return ((height * 2) * (width * 2));
    }
    double area(){
        return (height * width);
    }
}
