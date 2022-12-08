import java.util.*;
class _2a_8_sum_divisble_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("\nEnter even number (divisible by 3) till where sum is to be calculated: ");
        int n = s.nextInt();
        int sum = 0;

        for (int i=2; i<n+1; i+=2) {
            if (i%3==0) {
                sum+=i;
            }
            else {
                continue;
            }
        }
        
        System.out.println("\nSum of even numbers between 0 and " + n + " is " + sum + ".");
    }
}
