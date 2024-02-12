
package com.unicauca.figures.domain.model;

public class Square extends Figure{
    private double square;
    
    public Square(double lado){
        this.square = lado;
    }

    @Override
    public double calculateArea() {
        return square * square;
    }

    @Override
    public double calculatePerimeter() {
        return 4*square;
    }

    public double getSquare1() {
        return square;
    }
    public void setSquare1(double square) {
        this.square = square;
    }
}
