package com.company;

public class Main {

    public static void main(String[] args) {
	for(int i = 1; i <= 10; i++){
        Circle circ = new Circle(i);
        System.out.println("Area of a circle with radius " + i + " is " + circ.area() + " circumference is " + circ.circumference());
    }
    for(int i = 1; i <= 3; i++){
        for(int j = 1; j <= 3; j++){
            Rectangle rect = new Rectangle(i,j);
            System.out.println("Area of a rectangle " + i + " by " + j + " is " + rect.area() + " it's perimeter is " + rect.perimeter());


        }
    }
    Triangle tri1 = new Triangle(18,30,24);
    System.out.println("Area of a triangle 18x30x24 is " + tri1.area() +" it's perimeter is " + tri1.perimeter() + " and it's height is " + tri1.height());
    Triangle tri2 = new Triangle();
    System.out.println("Area of a triangle 3x4x5 is " + tri2.area() +" it's perimeter is " + tri2.perimeter() + " and it's height is " + tri2.height());
    }
}

