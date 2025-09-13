/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Graphics;
import java.util.ArrayList;


public interface DrawingEngine {
    void addShape(ShapeInterface shape);
    void removeShape(ShapeInterface shape);
    public ArrayList<ShapeInterface> getShapes();
    void refresh(Graphics canvas);
    
}
