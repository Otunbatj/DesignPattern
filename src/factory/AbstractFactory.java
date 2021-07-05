package factory;

import factory.enums.ShapeType;

public abstract class AbstractFactory {
    abstract public Shape getShape(ShapeType shapeType);
}
