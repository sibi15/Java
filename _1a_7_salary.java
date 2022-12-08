import java.util.*;
class _1a_7_salary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter daily wage: ");
        double daily_wage = s.nextDouble();
        System.out.println("\nEnter no. of days in the month that employee was present: ");
        int days_in_month = s.nextInt();
        int salary = (int)(daily_wage)*days_in_month;
        System.out.println("\nSalary for the employee in the month is: " + salary);
    }
}