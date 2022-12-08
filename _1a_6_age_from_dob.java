import java.util.*;
import java.lang.*;

class _1a_6_age_from_dob {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter date of birth in dd/mm/yyyy format: ");
        String dob = s.nextLine();
        
        System.out.println("\nEnter current date in dd/mm/yyyy format: "); 
        String curr_date = s.nextLine();
        
        int dob_yr = Integer.parseInt(dob.substring(6));
        int curr_yr = Integer.parseInt(curr_date.substring(6));

        System.out.println("\nAge is: " + (curr_yr-dob_yr));
    }
}   