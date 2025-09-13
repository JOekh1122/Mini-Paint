/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;


public class Line implements ShapeInterface{
    private Point startPoint;
    private Point endPoint;
    private Map<String, Double> properties;
    private Color color;
    private Color fillColor;
    
    
     @Override
    public void setPosition(Point position) {
        this.startPoint = position;
    }

    @Override
    public Point getPosition() {
        return this.startPoint;
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        this.properties = properties;
         if (properties.containsKey("xEnd") && properties.containsKey("yEnd")) {
            int xEnd = properties.get("xEnd").intValue();
            int yEnd = properties.get("yEnd").intValue();
            this.endPoint = new Point(xEnd, yEnd);  
        }
    }

    @Override
    public Map<String, Double> getProperties() {
        return this.properties;
    }
    
    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public Point getEndPoint() {
        return this.endPoint;
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
        if (startPoint == null || endPoint == null) {
            return;
        }
        
        if (color == null) {
            this.color = Color.BLACK;
        }

        canvas.setColor(color);
        canvas.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
    }
}
    
    
    
    
    
    
    

