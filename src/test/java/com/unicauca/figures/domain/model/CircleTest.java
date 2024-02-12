package com.unicauca.figures.domain.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    /**
     * Test of calculateArea method, of class Circle.
     */
    @Test
    public void testCalculateAreaSmall() {
        System.out.println("Calculate Area Small Circle");
        Circle instance = new Circle(1);
        double expResult = 3.14;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01); //Third value is a margin of error
    }
    @Test
    public void testCalculateAreaMedium() {        
        System.out.println("Calculate Area Medium Circle");
        double radius = 545679.0;
        Circle circle = new Circle(radius);
        double areaExpected = Math.PI * Math.pow(radius, 2);
        double areaActual = circle.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);

        radius = 2.7;
        circle.setRadius(radius);
        areaExpected = Math.PI * Math.pow(radius, 2);
        areaActual = circle.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);
    }
    @Test
    public void testCalculateAreaBig() {
        System.out.println("Calculate Area Big Circle");
        Circle instance = new Circle(423412329);
        double expResult = 563218448847328430.33;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
    /**
     * Test of calculatePerimeter method, of class Circle.
    */
    @Test
    public void testCalculatePerimeterSmall() {
        System.out.println("Calculate Perimeter Small Circle");
        Circle instance = new Circle(1);
        double expResult = 6.28;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
    @Test
    public void testCalculatePerimeterMedium() {
        System.out.println("Calculate Perimeter Medium Circle");
        Circle instance = new Circle(545679);
        double expResult = 3428602.27;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
    @Test
    public void testCalculatePerimeterBig() {
        System.out.println("Calculate Perimeter Big Circle");
        Circle instance = new Circle(423412329);
        double expResult = 2660378124.45;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
}
