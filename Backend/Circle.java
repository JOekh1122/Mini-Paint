/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public class Circle implements ShapeInterface{
    private Point circleCoordinates;
    private Map<String,Double> properties;
    private Color color;
    private Color fillColor;

    public Circle() {
    }
    
    
     
    
    public Circle(Point position, double radius) {
        this.circleCoordinates = position;  
        this.properties = new HashMap<>(); 
        this.properties.put("radius", 0.0);  
        this.color = Color.BLACK;  
        this.fillColor = Color.WHITE;  
        
     }

   
    public Circle(Point position, double radius, Color color, Color fillColor) {
        this(position, radius);  
        this.color = color;  
        this.fillColor = fillColor;  
    }


    
    
    @Override
    public void setPosition(Point position){
        this.circleCoordinates=position;
        
    }
    
    @Override
    public Point getPosition(){
        return this.circleCoordinates;
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
      int radius = properties.get("radius").intValue();
       if (!properties.containsKey("raduis")) {
            this.properties.put("raduis", 0.0);
            
        }
        
        
       
        if(this.circleCoordinates==null)
            this.circleCoordinates=new Point(0,0);
        if(color==null)
            this.color=Color.BLACK;
        if(fillColor==null)
            fillColor=Color.WHITE;
   
        canvas.setColor(this.fillColor);
        canvas.fillOval(circleCoordinates.x - radius, circleCoordinates.y - radius, radius * 2, radius * 2);
        canvas.setColor(color.BLACK);
        canvas.drawOval(circleCoordinates.x - radius, circleCoordinates.y - radius, radius * 2, radius * 2);
   
    
    }

  
}
