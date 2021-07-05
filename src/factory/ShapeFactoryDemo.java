package factory;

import factory.enums.ShapeType;

public class ShapeFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getShapeFactory(true);
        Shape shape = abstractFactory.getShape(ShapeType.CIRCLE);
        shape.draw();
    }
}
