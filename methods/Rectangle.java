public class Rectangle extends Shape {

    private double length, width;

    Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }

    public double getArea(){
        return length * width;
    }
    
}
