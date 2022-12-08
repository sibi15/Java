import java.util.*;
class _2a_4_pascal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter height l of pascal * pattern: ");
	    int l = s.nextInt();
        int i,j;
        int space=l-1;
        
        for (i=0; i<l; i++) {
	        
	        for (j=0; j<space; j++) {
		        System.out.print(" ");
	        }
	        for (j=0; j<=i; j++){
		        System.out.print("* ");
	        }
            System.out.print("\n");
	        space-=1;  // one less space after each row	
         }
   	}
}