public class AvgFunction{

    public static void main(String[] args){
        double a = 5.9, b = 10.2, c = 7.3;

        System.out.println("Average of " + a + ", " + b + " and " + c + " => " + avgThreeNumbers(a, b, c));
    }

    public static double avgThreeNumbers(double n1, double n2, double n3){
        return (n1 + n2 + n3)/ 3;
    }
}