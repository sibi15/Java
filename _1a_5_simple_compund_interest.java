import java.util.*;
class _1a_5_simple_compund_interest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter principal: ");
        double principal = s.nextDouble();

        System.out.println("\nEnter rate: ");
        double rate = s.nextDouble();

        System.out.println("\nEnter time in years: ");
        double time = s.nextDouble();
        
        System.out.println("\nEnter no. of times interest is compounded: ");
        int n = s.nextInt();

        double simple_interest = (principal*rate*time)/100;
        double compound_interest = principal * (Math.pow((1 + ((rate/100)/n)), (time * n))) - principal;

        System.out.println("\nSimple Interest is: " + simple_interest);
        System.out.println("Compound Interest is: " + compound_interest);
    }
}