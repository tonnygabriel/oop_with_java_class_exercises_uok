public class FindMin {

    public static void main(String[] args) {
        double[] myList = {1.9, 3.4, 2.9, 3.5, 0.8};
        double total = 0;
        double max= myList[0];
        double min = myList[0];

        for(double element: myList){
            System.out.println(element);
        }

        for(int i = 0; i < myList.length; i++ ){
            total += myList[i];
            if( myList[i] < min){
                min = myList[i];
            }
            if(myList[i] > max){
                max = myList[i];
            }
        }

        System.out.println("Total = " + total);
        System.out.println("Average = " + (total / myList.length));
        System.out.println("Max: " + max);
        System.out.println("Min: "+ min);
    }
}