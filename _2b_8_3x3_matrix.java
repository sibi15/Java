import java.util.*;
import java.util.Arrays;

class _2b_8_3x3_matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr = {{3,2,1},{6,4,5},{8,9,7}};
        int temp;
        
        // SORT:
        for (int i=0; i<3; i++) {  
            Arrays.sort(arr[i]);
        }
        
        System.out.println("\nArray after sorting is: ");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.println(arr[i][j]);
            }
        }

        // DELETE:
        System.out.println("\nElement to be deleted: ");
        int ele = s.nextInt();
        int arr_del[] = new int[3];
        
        int x = 0;
        for (int i=0; i<3; i++) {        // getting array
            for (int j=0; j<3; j++) {
                if (arr[i][j]==ele) {
                    arr_del=arr[i];
                    x=i;
                }
            }
        }


        int index = 0;
        for (int k=0; k<3; k++) {    // finding index
            if (arr_del[k]==ele){
                index = k;
            }
            else {
                continue;
            }
        }

        int[] arr_use = new int[2];
        for (int l=0; l<index; l++) {  //first half till position
            arr_use[l] = arr_del[l];
        }
        for (int m=index; m<2; m++) { // next half from position + 1
            arr_use[m] = arr_del[m+1];
        }

        arr[x] = arr_use;

        System.out.println("\nArray after deleting is: ");
        for (int i=0; i<3; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        int max = arr[0][0];

        for (int r=0; r<3; r++) {
            for (int t=0; t<arr[r].length; t++) {
                if (max<arr[r][t]) {
                    max=arr[r][t];
                }
            }
        }

        System.out.println("\nMaximum element is: " + max + ".");
    }
}
