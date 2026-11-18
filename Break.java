public class Break{

    public static void main(String[] args){
        int[] numbers ={5, 6 , 7, 8, 9};
        for(int x: numbers){
            if(x == 8){
                break;
            }
            System.out.print(x);
            System.out.print("\n");
        }
    }
}