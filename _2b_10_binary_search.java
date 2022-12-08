import java.util.*;
import java.util.Arrays;
class _2b_10_binary_search {
    
    public static int index_finder(int arr[], int element) {  // user defined function (finds index)
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==element) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter element to be found: ");
        int element = s.nextInt();
        int[] arr = {10,2,4,6,8};
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        
        while(low<=high) {
            int mid=(low+high)/2;
            if (arr[mid]==element) {
                System.out.println("Element found in array at position: " + (index_finder(arr, element)+1));
                break;
            }
            else if (arr[mid]<element) {
                low=mid+1;
            }
            else if (arr[mid]>element) {
                high=mid+1;
            }
        }
        System.out.println("\nElement not found in array.");   
    }
}