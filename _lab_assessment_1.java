import java.util.*;
 
class _lab_assessment_1 {
    public static void main (String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter number of books: ");
       int n = scan.nextInt();
       int[] a = new int[n];
 
       for (int i=0; i<n; i++) {
          System.out.println("Enter number of pages in book " + (i+1) + ": ");
          a[i] = scan.nextInt();
       }
 
       System.out.println("Enter number of students: ");
       int m = scan.nextInt();
 
       int max = a[0];
 
       if (m>n) {
           System.out.println("\nm>n: all students cannot be alloted atleast one book, wrong input.");
       }
       else if (m<1) {
           System.out.println("\nm<=0: Wrong input.");
       }
       else {
           for (int i=0; i<n; i++) {
               if (max<a[i]) {
                   max=a[i];
               }
               else {
                   continue;
               }
           }
       }
 
       int sum = 0;
 
       for (int i=0; i<n; i++) {
           if (a[i]==max) {
               sum+=0;
           }
           else {
               sum+=a[i];
           }
       }
 
       if (sum>max) {
           System.out.println("\nMinimum no. of pages: " + sum);
       }
       else {
           System.out.println("\n-1");
       }
    }
}