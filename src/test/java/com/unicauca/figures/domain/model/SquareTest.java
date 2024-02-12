package com.unicauca.figures.domain.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    
    /**
     * Test of calculateArea method, of class Square.
     */
    @Test
    public void testCalculateAreaSmall() {
        System.out.println("Calculate Area Small Square");
        Square instance = new Square(1);
        double expResult = 1;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01); //Third value is a margin of error
    }
    @Test
    public void testCalculateAreaMedium() {        
        System.out.println("Calculate Area Medium Square");
        double side = 545679;
        Square square = new Square(side);
        double areaExpected = side * side;
        double areaActual = square.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);

        side = 8;
        square.setSquare1(side);
        areaExpected = side * side;
        areaActual = square.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);
    }
    @Test
    public void testCalculateAreaBig() {
        System.out.println("Calculate Area Big Square");
        double side = 423412543;
        Square instance = new Square(side);
        double expResult = side * side;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
    
    /**
     * Test of calculatePerimeter method, of class Square.
    */
    @Test
    public void testCalculatePerimeterSmall() {
        System.out.println("Calculate Perimeter Small Square");
        Square instance = new Square(1);
        double expResult = 4;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
    @Test
    public void testCalculatePerimeterMedium() {
        System.out.println("Calculate Perimeter Medium Square");
        Square instance = new Square(545679);
        double expResult = 2182716;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
    @Test
    public void testCalculatePerimeterBig() {
        System.out.println("Calculate Perimeter Big Square");
        Square instance = new Square(423412329);
        double expResult = 1693649316;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
}
