import java.util.*;

class _3a_3_getchar_index_str {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter string: ");
        String str = s.next();
        System.out.println("\nEnter index to get from string: ");
        int n = s.nextInt();
        
        if (n>(str.length()-1)) {
            System.out.println("\nIndexError. Program exiting");
            System.exit(0);
        }
        
        System.out.println("\nElement present at index " + n + " is " + str.substring(n,(n+1)) + ".");
    }
}
