import java.util.*;

class _3a_2_umbrella_e {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter word to check if 'e' is present: ");
        String word = s.next();
        
        for (int i=0; i<word.length(); i++) {
            if (word.substring(i,i+1).equalsIgnoreCase("e")) { // comparing substr
                System.out.println("\nLetter 'e' present in " + word + " at position " + (i+1) + ".");
                System.exit(0);
            }
            else {
                continue;
            }
        }
    }
}