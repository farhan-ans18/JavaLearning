package Practice;

class Shape {
    public Shape draw() {
        System.out.println("Drawing a shape");
        return this;
    }
}

class Circle extends Shape {
    public Circle draw() {
        System.out.println("Drawing a circle");
        return this;
    }
}

class Rectangle extends Shape {
    public Rectangle draw() {
        System.out.println("Drawing a rectangle");
        return this;
    }
}
public class CoVarriantExample {

	public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Shape drawnShape = shape.draw();
        Circle drawnCircle = circle.draw();
        Rectangle drawnRectangle = rectangle.draw();
        
        // getClass() return the name of the packages and class and for only class name use getClass().getSimpleName()
        
        System.out.println("Drawn shape type: " + drawnShape.getClass());
        System.out.println("Drawn circle type: " + drawnCircle.getClass().getSimpleName());
        System.out.println("Drawn rectangle type: " + drawnRectangle.getClass().getSimpleName());
    }
}


