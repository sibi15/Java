import java.util.*;
import java.util.Arrays;

class _2b_9_jagged_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] Raja = {78,85,0,0,0};
        int[] Dev = {81,89,90,76,0};
        int[] Arush = {54,67,78,0,0};
        int[] John = {56,87,54,45,78};

        //int[][] marks = {{'Raja',78,85},{'Dev',81,89,90,76},{"Arush",54,67,78},{"John",56,87,54,45,78}};
        int[][] marks = {Raja, Dev, Arush, John};
        String[] names = {"Raja", "Dev", "Arush", "John"};

        System.out.println("\nEnter name of student whose marks are to be shown: ");
        String name = s.next();
        for (int i=0; i<4; i++) {
            if (name.equalsIgnoreCase(names[i])) {
                System.out.println("\nMarks for " + name + " are: ");
                for (int k=0; k<5; k++) {
                    System.out.println(marks[i][k]);
                }
            }
            else {
                continue;
            }
        }
    }
}
