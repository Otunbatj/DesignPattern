package factory;

public class FactoryProducer {
    public static AbstractFactory getShapeFactory(boolean isRounded){
        if(isRounded){
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
