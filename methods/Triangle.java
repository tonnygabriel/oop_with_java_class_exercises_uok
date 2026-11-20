public class Triangle extends Shape {
    private double base, height;

    Triangle(double b, double h){
        this.base = b;
        this.height = h;
    }

    public double getArea(){
        return (base * height) / 2;
    } 
}
