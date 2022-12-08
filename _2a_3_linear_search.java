import java.util.*;
class _2a_3_linear_search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter no. of elements in array");
        int n = s.nextInt();
        int[] array = new int[n];

        for (int i=0; i<n; i++) {
            System.out.println("\nEnter element " + (i+1));
            int arr_ele = s.nextInt();
            array[i] = arr_ele;
        }

        System.out.println("\nElement to be found: ");
        int ele = s.nextInt();

        for (int i=0; i<n; i++) {
            if (array[i] == ele) {
                System.out.println("\nElement found at index: " + i);
                break;
            }
            else if (i==(n-1)) {
                System.out.println("\nEntered element not found in array.");
            }
            else {
                continue;
            }
        }
    }
}