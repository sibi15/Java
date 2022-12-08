import java.util.*;

class _3a_7_get_substr_bw_indices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("\nEnter string: ");
        String str = s.nextLine();
        
        System.out.println("\nEnter starting position of substring: ");
        int pos1 = s.nextInt();
        System.out.println("Enter ending position of substring: ");
        int pos2 = s.nextInt();

        if ((pos1>pos2) || (pos1<1) || (pos2>str.length())) {   // index error check
            System.out.println("\nError in index input.\n");
            System.exit(0);
        }

        System.out.println("\nRequired substring between positions " + pos1 + 
        " and " + pos2 + " is: " + str.substring((pos1-1),pos2) + "\n");
    }
}
