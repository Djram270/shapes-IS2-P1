
package com.unicauca.figures;

import com.unicauca.figures.domain.presentation.GUICircle;
import com.unicauca.figures.domain.presentation.GUITriangle;
import com.unicauca.figures.domain.presentation.GUISquare;
/**
 *
 * @authors Oscar Andres Tosne Perez
 *          Miguel Polo
 *          Samuel Guilombo Gomez
 */
public class Main {

    public static void main(String[] args) {
        GUICircle guiCircle = new GUICircle();
        guiCircle.setSize(400, 300);
        guiCircle.setLocation(180,300);
        guiCircle.setVisible(true);
        
        GUITriangle guiTriangle = new GUITriangle();
        guiTriangle.setSize(400, 300);
        guiTriangle.setLocation(580,300);
        guiTriangle.setVisible(true);
        
        GUISquare guiSquare = new GUISquare();
        guiSquare.setSize(400, 300);
        guiSquare.setLocation(980, 300);
        guiSquare.setVisible(true);
    }
}
