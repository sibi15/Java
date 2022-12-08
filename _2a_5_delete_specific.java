import java.util.*;
import java.util.Arrays;

class _2a_5_delete_specific {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter size of array: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            System.out.println(("\nEnter element " + (i+1) + ": "));
            int ele = s.nextInt();
            arr[i] = ele;
        }

        System.out.println("\nEnter operation to be done on array: \n1. Insert.\n2. Delete.");
        int choice = s.nextInt();

        if (choice == 1) {   // insert
            int[] arr_insert = new int[n+1];
            System.out.println("\nEnter position of array to insert element in: ");
            int position = s.nextInt();
            System.out.println("\nEnter element to insert into array: ");
            int element_in = s.nextInt();
            
            for (int j=0; j<position; j++) {  //first half till position
                arr_insert[j] = arr[j];
            }
            for (int k=position+1; k<n+1; k++) { // next half from position + 1
                arr_insert[k] = arr[k-1];
            }
            arr_insert[position] = element_in;   // inserting element in void position 
            System.out.println("\nOld Array is: " + Arrays.toString(arr));
            System.out.println("\nNew Array after insertion is: " + Arrays.toString(arr_insert));
        }
        
        else if (choice == 2) {      // delete
            int[] arr_delete = new int[n-1];
            System.out.println("\nEnter position of element to delete: ");
            int position = s.nextInt();
            for (int l=0; l<position; l++) {  //first half till position
                arr_delete[l] = arr[l];
            }
            for (int m=position; m<n-1; m++) { // next half from position + 1
                arr_delete[m] = arr[m+1];
            }
            System.out.println("\nOld Array is: " + Arrays.toString(arr));
            System.out.println("\nNew Array after insertion is: " + Arrays.toString(arr_delete));
        }
    }
}
