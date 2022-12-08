import java.util.*;
public class _6b_software_company_exception {
        public static void main (String args[]) {
        int n;
        float days,cost;
        Scanner s = new Scanner(System.in);
        
        System.out.println("\nEnter duration of project in days: ");
        days = s.nextFloat();
        if (days <= 1.0) {
            try {
                throw new Exception("\nDuration is lesser than its supposed to be.");
            }
            catch (Exception e) {   
                System.out.println("\nDuration is lesser than its supposed to be.");
                System.exit(0);
            }
        }
        
        System.out.println("Enter number of people working in the project: ");
        n = s.nextInt();
        if (n < 1) {
            try {
                throw new Exception("\nInsufficient number of people.");
            }
            catch (Exception e) {
                System.out.println("\nInsufficient number of people.");
                System.exit(0);
            }
        }
        
        System.out.println("Enter cost of project: ");
        cost = s.nextFloat();
        if (cost < 1.0) {
            try {
                throw new Exception("\nCost not high enough.");
            }
            catch (Exception e) {
                System.out.println("\nCost not high enough.");
                System.exit(0);
            }
        }
    }
}
