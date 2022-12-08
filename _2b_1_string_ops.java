import java.util.*;
class _2b_1_string_ops {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter string 1: ");
        String str1 = s.nextLine();
        System.out.println("\nEnter string 2: ");
        String str2 = s.nextLine();
        int l1 = str1.length();
        int l2 = str2.length();

        System.out.println("\nLength of the inputed string " + str1 + " is " + l1 + ".");
        System.out.println("Length of the inputed string " + str1 + " is " + l2 + ".");

        System.out.println("\nConcatenated string is: " + (str1+str2) + ".");
        
        String capitalized_str1 = str1.substring(0,1).toUpperCase() + str1.substring(1);
        System.out.println("\nCapitalized string 1 is: " + capitalized_str1 + ".");
    }
}
