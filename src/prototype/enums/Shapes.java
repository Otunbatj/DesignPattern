package prototype.enums;

public enum Shapes {
    CIRCLE("1"),
    SQUARE("2"),
    RECTANGLE("3");

    private String shapeId;

    Shapes(String shapeId){
        this.shapeId = shapeId;
    }

    public String getShapeId(){
        return this.shapeId;
    }
}
