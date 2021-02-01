import java.io.*;
import java.lang.*;
import java.util.Arrays;
/*public class InsertElementAtSpecificPos {
             public static void main(String[] args)
            {
                int n = 10;
                int i;

                // initial array of size 10
                int arr[]= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

                // print the original array
                System.out.println("Initial Array:\n"
                        + Arrays.toString(arr));

                // element to be inserted
                int x = 50;

                // position at which element
                // is to be inserted
                int pos = 5;

                // call the method to insert x
                // in arr at position pos
                arr = insertX(n, arr, x, pos);

                // print the updated array
                System.out.println("\nArray with " + x
                        + " inserted at position "
                        + pos + ":\n"
                        + Arrays.toString(arr));
            }
        }*/
//import java.util.Arrays;
public class InsertElementAtSpecificPos {

    public static void main(String[] args) {

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        // Insert an element in 3rd position of the array (index->2, value->5)

        int Index_position = 2;
        int newValue    = 5;

        System.out.println("Original Array : "+Arrays.toString(my_array));

        for(int i=my_array.length-1; i > Index_position; i--){
            my_array[i] = my_array[i-1];
        }
        my_array[Index_position] = newValue;
        System.out.println("New Array: "+Arrays.toString(my_array));
    }
}

