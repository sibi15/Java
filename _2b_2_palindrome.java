import java.util.*;
class _2b_2_palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter string to check if palindrome or not: ");
        String str = s.nextLine();
        String reverse = "";
        char[] str_char_arr = str.toCharArray();
        for (int i=str.length()-1; i>-1; i--) {
            reverse = reverse + str_char_arr[i];
        }
        if (str.equalsIgnoreCase(reverse)){
            System.out.println("\nString " + str + " is palindrome.\n");
        }
        else {
            System.out.println("\n" + str + " is not a palindrome string.\n");
        }
    }
}