package factory;

import factory.enums.ShapeType;
import factory.shapes.Circle;
import factory.shapes.Rectangle;
import factory.shapes.Square;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(ShapeType shapeType) {
        if (null == shapeType) {
            return null;
        }
        if (shapeType == ShapeType.CIRCLE) {
            return new Circle();
        } else if (shapeType == ShapeType.SQUARE) {
            return new Square();
        } else if (shapeType == ShapeType.RECTANGLE) {
            return new Rectangle();
        }

        return null;
    }
}
