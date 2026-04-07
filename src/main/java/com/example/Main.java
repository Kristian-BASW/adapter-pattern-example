package com.example;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        System.out.println("\nrect tells the system: 'I want to fit in'\n");
        rect.draw();
        // A Circle is not equal a rectangle
        System.out.println("");
        ICircle circle = new RectangleToCircleAdapter(rect);
        circle.draw();
        System.out.println("");

    }
}