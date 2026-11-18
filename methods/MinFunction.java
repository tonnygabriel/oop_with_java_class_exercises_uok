public class MinFunction {

    public static void main(String[] args) {
        int a = 11;
        int b = 6;

        System.out.println("Mnimum value between " + a + " and " + b + " is " + minFunction(a, b));
    }

    public static int minFunction(int n1, int n2){
        if(n1 < n2){
            return n1;
        }else{
            return n2;
        }
    }
}