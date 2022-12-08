import java.util.*;
import java.io.*;

class _2b_3_vowel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter string: ");
        String str = s.nextLine();
        str = str.toLowerCase();
        //char[] str_char_arr = str.toCharArray();
        int vowel_sum = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || 
            str.charAt(i)=='o' || str.charAt(i)=='u') {
                vowel_sum+=1;
            }
            else {
                continue;
            }
        }
        
        if (vowel_sum==0) {
            System.out.println("0");
        }
        else {
            System.out.println("\nNo. of vowels in " + str + " is " + vowel_sum + ".");
        }
    }
}