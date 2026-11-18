public class Circle extends Shape{
    private  double radius;

    Circle(double r){
        this.radius = r;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
