
package com.unicauca.figures.domain.model;

public class Circle extends Figure{
    private double radius;
    
    public Circle(double radio){
        this.radius = radio;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(getRadius(),2);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI*getRadius()*2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
