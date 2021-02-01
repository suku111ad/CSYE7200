import java.util.Arrays;
public class TraversalArray {
    public static void main(String args[]) {
        int myArray[] = new int[7];
        myArray[0] = 12;
        myArray[1] = 32;
        myArray[2] = 43;
        myArray[3] = 54;
        myArray[4] = 99;
        myArray[5] = 88;
        System.out.println("My array is: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);

            //for(int element: myArray)
            //  System.out.println(element);
        }
    }
}
