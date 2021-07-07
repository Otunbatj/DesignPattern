package prototype.cache;

import prototype.Circle;
import prototype.Rectangle;
import prototype.Shape;
import prototype.Square;

import java.util.Hashtable;

public class ShapeCache {
    //This is creating an Hashtable to use as a temporary cache for all the Shape object
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    /**
     * This method gets a particular SHape form the cache
     * and returns its clone to the caller
     * @param shapeId of the desired Shape
     * @return the Shape associated with this shapeId in the cache memory
     */
    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /**
     * This method prepares each shape object:
     * Source can be from an API call or a
     * database query, loads the objects into
     * the cache
     */
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
