/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public class Square implements ShapeInterface {
    
    private Point squareCoordinates;
    private Map<String,Double> properties;
    private Color color;
    private Color fillColor;
   
    @Override
    public void setPosition(Point position){
        this.squareCoordinates=position;
        
    }
    
    @Override
    public Point getPosition(){
        return this.squareCoordinates;
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
        if (!properties.containsKey("side")) {
            this.properties.put("side", 0.0);
            
        }
        if(this.squareCoordinates==null)
            this.squareCoordinates=new Point(0,0);
        if(color==null)
            this.color=Color.BLACK;
        if(fillColor==null)
            fillColor=Color.WHITE;
   
        canvas.setColor(fillColor);
        canvas.fillRect(squareCoordinates.x,squareCoordinates.y,properties.get("side").intValue(),properties.get("side").intValue());
        canvas.setColor(color);
        canvas.drawRect(squareCoordinates.x,squareCoordinates.y,properties.get("side").intValue(),properties.get("side").intValue());
   
    
    }
    
  
    

    
}


