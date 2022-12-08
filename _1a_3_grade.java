import java.util.*;
class _1a_3_grade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter grade: ");
        int grade = s.nextInt();
        
        if (grade>90) {
            System.out.println("\nGrade is O.");
        }
        else if (grade>80 && grade<91) {
            System.out.println("\nGrade is A.");
        }
        else if (grade>70 && grade<81) {
            System.out.println("\nGrade is B.");
        }
        else if (grade>60 && grade<71) {
            System.out.println("\nGrade is C.");
        }
        else if (grade>=50 && grade<61) {
            System.out.println("\nGrade is D.");
        }
        else if (grade>=0 && grade<50) {
            System.out.println("\nGrade is RA.");
        }
    }
}
