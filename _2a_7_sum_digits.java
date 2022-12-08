import java.util.*;
import java.lang.Math;
class _2a_7_sum_digits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter number whose sum of digits is to be found: ");
        int num = s.nextInt();
        int temp = num;
        int sum = 0;
        while (num!=0) {
            sum += num%10;
            num = Math.floorDiv(num, 10);
        }
        System.out.println("\nSum of digits of " + temp + " is " + sum);
    }
}