public class Sum {

    public Sum(double num1, double num2){
        double sum= num1 + num2 ;
        System.out.println(num1 + " + " + num2 + " = " + sum );
    }

    public static void main(String[] args) {
        Sum mySum = new Sum(25.35, 30.15);
    }
}