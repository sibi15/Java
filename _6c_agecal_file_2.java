import java.util.*;
import p1.*;

public class _6c_agecal_file_2 implements i1 {
    int calculate() {
        int dob_yr = Integer.parseInt(dob.substring(6));
        int curr_yr = Integer.parseInt(curr_date.substring(6));
        return curr_yr-dob_yr;
    }

    void display() {
        System.out.println("Age is: " + age);
    }
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter date of birth in dd/mm/yyyy format: ");
        String dob = s.nextLine();

        System.out.println("\nEnter current date in dd/mm/yyyy format: "); 
        String curr_date = s.nextLine();
        
        int age = calculate();
    }
}