package prototype;

import prototype.cache.ShapeCache;
import prototype.enums.Shapes;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        //Load all Shapes into cache memory
        ShapeCache.loadCache();
        //Create the clone of each shapes from the cache memory
        Shape clonedShape = ShapeCache.getShape(Shapes.CIRCLE.getShapeId());
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape(Shapes.SQUARE.getShapeId());
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape(Shapes.RECTANGLE.getShapeId());
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
