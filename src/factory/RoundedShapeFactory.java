package factory;

import factory.enums.ShapeType;
import factory.shapes.RoundedCircle;
import factory.shapes.RoundedRectangle;
import factory.shapes.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(ShapeType shapeType) {
        if (null == shapeType) {
            return null;
        }

        if (shapeType == ShapeType.SQUARE) {
            return new RoundedSquare();
        } else if (shapeType == ShapeType.CIRCLE) {
            return new RoundedCircle();
        } else if (shapeType == ShapeType.RECTANGLE) {
            return new RoundedRectangle();
        }

        return null;
    }
}
