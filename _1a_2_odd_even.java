import java.util.*;
class _1a_2_odd_even {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to find if odd or even:");
        int n = s.nextInt();
        
        if (n%2==0) {
            System.out.println("\n" + n + " is even.");
        }
        else {
            System.out.println("\n" + n + " is odd.");
        }
    }
}