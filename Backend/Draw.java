/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package backend;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.Graphics;


public class Draw implements DrawingEngine {
private ArrayList<ShapeInterface> shapes = new ArrayList<>();

    @Override
   public void addShape( ShapeInterface shape) {
    shapes.add(shape);

}

    @Override
    public void removeShape(ShapeInterface shape) {

        shapes.remove(shape);
    }

    @Override
    public ArrayList<ShapeInterface> getShapes() {

        return shapes;
    }

    @Override
    public void refresh(Graphics canvas) {
        for (ShapeInterface s : shapes) {
            s.draw(canvas);  
        }
    }
 
}