import java.util.*;

class _3a_1_abbreviations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("\nEnter first name: ");
        String first = s.next();
        System.out.println("\nEnter middle name: ");
        String middle = s.next();
        System.out.println("\nEnter last name: ");
        String last = s.next();

        first = first.substring(0,1).toUpperCase();
        middle = middle.substring(0,1).toUpperCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1);
        

        System.out.println("\nYour abbreviated name is " + first.substring(0,1) + '.' 
        + middle.substring(0,1) + ". " + last + ".");
    }
    
}
