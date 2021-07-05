package factory.shapes;

import factory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("I am drawing a Rectangle");
    }
}
