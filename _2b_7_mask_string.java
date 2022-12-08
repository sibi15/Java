import java.io.*;
import java.util.*;
 
class _2b_7_mask_string {
    public static String removeChars(String string1, String string2) {
        for (int index = 0; index < string2.length(); index++) {
            char i = string2.charAt(index);
            
            while (string1.contains(i + "")) {
                int itr = string1.indexOf(i);
                    string1 = string1.replace((i + ""), "");
            }
        }
        return string1;
    }
 
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("\nEnter string: ");
        String str = s.nextLine();

        System.out.println("\nEnter mask string: ");
        String mask = s.nextLine();

        System.out.println(removeChars(str, mask));
    }
}










//import java.util.*;
//import java.lang.String;
//class _2b_7_mask_string {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("\nEnter string: ");

//        String str = s.nextLine();
//        char[] char_arr = str.toCharArray();

//      System.out.println("\nEnter mask string: ");
//        String mask = s.nextLine();
//        char[] char_mask = str.toCharArray();
//
//        for (int i=0; i<mask.length(); i++) {
//            int index = str.indexOf(char_mask[i]);
//            str=str.Remove(index,1);
//
//        }

        
//        int index = str.indexOf('R');
//        str=str.Remove(index,1);
//    }
//}
