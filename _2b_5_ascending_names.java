import java.util.*;
class _2b_5_ascending_names {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter no. of names to sort in ascending order: ");
        int n = s.nextInt();
        String[] names = new String[n];

        for (int i=0; i<n; i++) {
            System.out.println("\nEnter name " + (i+1) + ": ");
            names[i] = s.next();
        }

        String temp = " ";
        
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n;j++) {
                if (names[i].compareTo(names[j])>0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        
        System.out.println("\nNames after sorting are: ");
        for (int k=0; k<n; k++) {
            System.out.println(names[k]);
        }
    }
}
