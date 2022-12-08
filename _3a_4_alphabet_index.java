import java.util.*;
class _3a_4_alphabet_index  {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter string: ");
        String str = s.nextLine();
        int i=0;
        
        for(i=0; i<str.length(); i++) {  // lowercasing all letters
            str = str.substring(0,i) + str.substring(i,(i+1)).toLowerCase() 
            + str.substring(i+1);
        }  
        
        String[] alphabet = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m",
        "n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int[] i_arr = new int[26];      // array of indexes of 26 alphabets

        for (i=0; i<26; i++) {          // inserting indexes of all alphabets
            i_arr[i]=str.indexOf(alphabet[i], 0);
        }

        System.out.println("\na  b  c  d  e  f  g  h  i  j");
        System.out.println("============================");
        System.out.println(i_arr[0] + " " + i_arr[1] + " " + i_arr[2] + " " + i_arr[3] + " " +
                           i_arr[4] + " " + i_arr[5] + " " + i_arr[6] + " " + i_arr[7] + " " +
                           i_arr[8] + " " + i_arr[9] + "\n");
        System.out.println("k  l  m  n  o  p  q  r  s  t");
        System.out.println("============================");
        System.out.println(i_arr[10] + " " + i_arr[11] + " " + i_arr[12] + " " + i_arr[13] + " "
                         + i_arr[14] + " " + i_arr[15] + " " + i_arr[16] + " " + i_arr[17] + " "
                         + i_arr[18] + " " + i_arr[19] + "\n");
        System.out.println("u  v  w  x  y  z");
        System.out.println("================");
        System.out.println(i_arr[20] + " " + i_arr[21] + " " + i_arr[22] + " " + i_arr[23] + " "
                         + i_arr[24] + " " + i_arr[25] + "\n");
    }
}   