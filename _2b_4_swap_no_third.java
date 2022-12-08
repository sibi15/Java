import java.util.*;
class _2b_4_swap_no_third {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter string 1: ");
        String str1 = s.nextLine();
        System.out.println("\nEnter string 2: ");
        String str2 = s.nextLine();

        int l1 = str1.length();
        int l2 = str2.length();
    
        str1 = str1 + str2;
        str2 = str1.substring(0,l1);
        str1 = str1.substring(l1,l1+l2);
        
        System.out.println("\nString 1 is now: " + str1);
        System.out.println("String 2 is now: " + str2);
    }
}
