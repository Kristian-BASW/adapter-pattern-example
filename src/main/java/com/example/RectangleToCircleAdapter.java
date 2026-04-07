package com.example;

public class RectangleToCircleAdapter implements ICircle {

    private Rectangle _rectangle;
    public RectangleToCircleAdapter(Rectangle rectangle){
        _rectangle = rectangle;
    }

    @Override
    public void draw() {
        int radius = Math.min(_rectangle.getHeight(), _rectangle.getWidth()) / 2;
        
        System.out.println("I am Circle with the radius of: " + radius);
    }
    
}
