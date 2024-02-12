
package com.unicauca.figures.domain.model;

public class Triangle extends Figure{
    private double base;
    private double height;
    private double side2;
    private double side3;
    
    public Triangle(double prmBase, double prmHeight,double prmSide2, double prmSide3){
        this.base = prmBase;
        this.side2 = prmSide2;
        this.side3 = prmSide3;
        this.height = prmHeight;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return base+side2+side3;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
