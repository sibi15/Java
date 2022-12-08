import java.util.*;
class _2a_6_min_max {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter number of elements in array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        int max,min,temp=0; 

        for (int i=0; i<n; i++) {
            System.out.println("\nEnter element " + (i+1) + ": ");
            int arr_ele = s.nextInt();
            arr[i] = arr_ele;
        }

        min = arr[0];
        max = arr[0];
        
        for (int j=0; j<n; j++) {     // max loop
            if (arr[j]>max) {
                max = arr[j];
            }
            if (arr[j]<min) {
                min = arr[j];
            }
        }

        System.out.println("\nMinimum value element in the array is: " + min + ".");
        System.out.println("Maximum value element in the array is: " + max + ".");
    }
}
