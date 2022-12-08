import java.util.*;
class _2b_11_count_vowels_conso {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("\nEnter string: ");
        String word = s.nextLine();
        String word_original=word;
        word=word.toLowerCase();
 
        int vowel_sum=0;
        int consonant_sum=0;
        
        //char[] word_char = word.toCharArray();
        
        //char[] vowels = "aeiou".toCharArray();
        //char[] consonants = "bcdfghjklmnpqrstvwxyz".toCharArray();

        for (int i=0; i<word.length(); i++) {
            if (word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || 
            word.charAt(i)=='o' || word.charAt(i)=='u') {
                vowel_sum+=1;
            }
            else if (word.charAt(i)>='a' && word.charAt(i)<='z') {
                consonant_sum+=1;
            }
        }
        System.out.println("\nThere are " + vowel_sum + " vowels in " + word_original + ".");
        System.out.println("There are " + consonant_sum + " consonants in " + word_original + ".");
    }
}