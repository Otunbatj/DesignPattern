package factory.shapes;

import factory.Shape;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a rounded rectangle");
    }
}
