import java.util.*;

class _3a_6_replace_substr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter string: ");
        String str = s.nextLine();
        System.out.println("\nEnter substring to take out from string: ");
        String substr = s.nextLine();
        System.out.println("\nEnter replacement of substring: ");
        String replacement = s.nextLine();

        String str_after = str.replaceAll(substr,replacement);

        System.out.println("\nOriginal string is:  " + str + ".");
        System.out.println("String after change: " + str_after + ".\n");
    }
}
