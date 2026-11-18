import java.util.Scanner;
public class InputJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        float number = scanner.nextFloat();

        if(number > 0){
            System.out.println(number + " is positive!");
        }else{
            System.out.println(number + " is negative");
        }

        scanner.close();
    }
}