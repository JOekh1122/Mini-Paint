/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author LENOVO
 */
public class Rectangle implements ShapeInterface{
    private Point rectangleCoordinates;
    private Map<String,Double> properties;
    private Color color;
    private Color fillColor;
   
    @Override
    public void setPosition(Point position){
        this.rectangleCoordinates=position;
        
    }
    
    @Override
    public Point getPosition(){
        return this.rectangleCoordinates;
    }
    @Override
    public void setProperties(Map<String, Double> properties) {
        this.properties = properties;
    }

    @Override
    public Map<String, Double> getProperties() {
        return this.properties;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public Color getFillColor() {
        return this.fillColor;
    }
     @Override
    public void draw(Graphics canvas) {
        if (!properties.containsKey("length")) {
            this.properties.put("length", 0.0);
            
        }
        if(!properties.containsKey("width")) {
            this.properties.put("width", 0.0);
            
        }
        if(this.rectangleCoordinates==null)
            this.rectangleCoordinates=new Point(0,0);
        if(color==null)
            this.color=Color.BLACK;
        if(fillColor==null)
            fillColor=Color.WHITE;
   
        canvas.setColor(fillColor);
        canvas.fillRect(rectangleCoordinates.x,rectangleCoordinates.y,properties.get("length").intValue(),properties.get("width").intValue());
        canvas.setColor(color);
        canvas.drawRect(rectangleCoordinates.x,rectangleCoordinates.y,properties.get("length").intValue(),properties.get("width").intValue());
   
    
    }
    
  
    

    
}
