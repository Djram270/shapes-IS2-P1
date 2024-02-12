package com.unicauca.figures.domain.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    /**
     * Test of calculateArea method, of class Circle.
     */
    @Test
    public void testCalculateAreaSmall() {
        System.out.println("Calculate Area Small Triangle");
        Triangle instance = new Triangle(1, 1, 1, 1);
        double expResult = 0.5;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01); //Third value is a margin of error
    }
    @Test
    public void testCalculateAreaMedium() {        
        System.out.println("Calculate Area Medium Triangle");
        Triangle instance = new Triangle(545679, 545679, 545679, 545679);
        double expResult = 148882785520.5;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
    @Test
    public void testCalculateAreaBig() {
        System.out.println("Calculate Area Big Triangle");
        Triangle instance = new Triangle(423412329, 423412329, 423412329, 423412329);
        double expResult = 89639000174602120.05;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
    /**
     * Test of calculatePerimeter method, of class Circle.
    */
    @Test
    public void testCalculatePerimeterSmall() {
        System.out.println("Calculate Perimeter Small Triangle");
        Triangle instance = new Triangle(1, 1, 1, 1);
        double expResult = 3;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
    @Test
    public void testCalculatePerimeterMedium() {
        System.out.println("Calculate Perimeter Medium Triangle");
        Triangle instance = new Triangle(545679, 545679, 545679, 545679);
        double expResult = 1637037;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
    @Test
    public void testCalculatePerimeterBig() {
        System.out.println("Calculate Perimeter Big Triangle");
        Triangle instance = new Triangle(423412329, 423412329, 423412329, 423412329);
        double expResult = 1270236987;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
}
