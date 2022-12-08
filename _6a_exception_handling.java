import java.util.*;
public class _6a_exception_handling {
    public static void main(String args[]) {
        int Num1,Num2;
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("\nEnter number 1: ");
            Num1 = Integer.parseInt(s.nextLine());
            System.out.println("Enter number 2: ");
            Num2 = Integer.parseInt(s.nextLine());
            int ans = Num1/Num2;
            System.out.println("\nNum1 / Num2 = " + ans);
        }  
        catch (ArithmeticException arithmetic) {
            System.out.println("\n" + arithmetic);
        }
        catch (NumberFormatException format) {
            System.out.println("\n" + format);
        }
    }
}