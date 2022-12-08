import java.util.*;
class _2a_2_average_arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[4];
        double sum=0;
        for (int i=0;i<4;i++) {
            System.out.println("\nEnter element " + (i+1) + ": ");
            int ele = s.nextInt();
            sum+=ele;
            arr[i]=ele;
        }
        double avg = sum/4;
        System.out.println("\nAverage is: " + avg);
    }
}