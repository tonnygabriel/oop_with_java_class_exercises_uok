public class ShapeInheritance {

    public static void main(String[] args) {
        Circle circle = new Circle(7.5);
        Rectangle rect = new Rectangle(4.5, 5.1);

        System.out.print("Circle with radius: 7.5 has an area of: " + circle.getArea());
        System.out.println();

        System.out.print("Rectangle with length: 4.5 and width: 5.1 has an area of: " + rect.getArea());
        System.out.println();
    }
}