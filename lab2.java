
public class lab2{

    public interface Shape {
        void draw();
    }

    public class Rectangle implements Shape {
        @Override
        public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
        }
    }


    public class Square implements Shape {
        @Override
        public void draw() {
        System.out.println("Inside Square::draw() method.");
        }
    }

    // public class ShapeFactory {
    //     public Shape getShape(String shapeType){
    //     if(shapeType == null){
    //     return null;
    //     }
    //      if(shapeType.equalsIgnoreCase("RECTANGLE")){
    //     return new Rectangle();
    //     } else if(shapeType.equalsIgnoreCase("SQUARE")){
    //     return new Square();
    //     }
    //     return null;
    //     }
    // }
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

    }
}