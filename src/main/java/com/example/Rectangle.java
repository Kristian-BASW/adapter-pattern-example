package com.example;

// The Adaptee (the incompatible object)
class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing rectangle with width " + width +
                           " and heighth " + height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}