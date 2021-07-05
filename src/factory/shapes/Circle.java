package factory.shapes;

import factory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("I am drawing a Circle");
    }
}
