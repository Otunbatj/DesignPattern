package factory.shapes;

import factory.Shape;

public class RoundedCircle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a rounded circular shape");
    }
}
