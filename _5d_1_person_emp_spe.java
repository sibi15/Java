/*Had attempted to extend abstract classes into derived classes which can't be done since 
multiple inheritance (multiple extends) can't be done in Java. So below given code, 
commented code is there which attempts to use abstract classes also. */

import java.util.*;
import java.lang.*;

interface calculate {
    public void salary_calculate();
    public void leave_approval();
}

abstract class details {
    abstract void calculate_age();
    abstract void calculate_experience();
    abstract void display();
}

class Person {
    int age;
    String name;
    String sex;
}

class Employee extends Person implements calculate {
    Scanner scan1 = new Scanner(System.in);
    int code;
    int daily_wage;
    int days;
    int salary;
    String leave;
    String dob;
    String curr_date;
    String starting_date;
        
    void display() {
        System.out.println("\nEMPLOYEE Class: ");
        System.out.println("Name: " + name + "\nAge: " + age + "\nSex: " + sex + "\nEmployee code: " + code);
    }
    
    void get_interface() {
        System.out.println("\nEnter daily wage: ");
        daily_wage = scan1.nextInt();
        System.out.println("Enter days present: ");
        days = scan1.nextInt();
        System.out.println("Enter decision on leave approval (yes or no): ");
        leave = scan1.next();
    }
    
    public void salary_calculate() {
        salary = daily_wage*days;
        System.out.println("\nSalary is " + salary);
    }
    
    public void leave_approval() {
        if (leave.equalsIgnoreCase("yes")) {
            System.out.println("Leave request APPROVED.");
        }
        else {
            System.out.println("Leave request DENIED.");
        }
    }
}

class Specialist extends Employee {
    String s;
    
    void display() {
        System.out.println("\nSPECIALIST Class: ");
        System.out.println("Name: " + name + "\nAge: " + age + "\nSex: " + sex + "\nEmployee code: " + code + "\nSpecialist category: " + s);
    }
}

public class _5d_1_person_emp_spe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee[] e = new Employee[3];
        Specialist[] s = new Specialist[3];
        for (int i=0; i<3; i++) {
            e[i] = new Employee();
            System.out.println("\nEnter EMPLOYEE Class " + (i+1) + " details: ");
            System.out.println("Enter name: ");
            e[i].name = scan.next();
            System.out.println("Enter age: ");
            e[i].age = scan.nextInt();
            System.out.println("Enter sex (M/F): ");
            e[i].sex = scan.next();
            System.out.println("Enter employee code: ");
            e[i].code = scan.nextInt();
            e[i].display();
            
            s[i] = new Specialist();
            System.out.println("\nEnter SPECIALIST Class " + (i+1) + " details: ");
            System.out.println("Enter name: ");
            s[i].name = scan.next();
            System.out.println("Enter age: ");
            s[i].age = scan.nextInt();
            System.out.println("Enter sex (M/F): ");
            s[i].sex = scan.next();
            System.out.println("Enter employee code: ");
            s[i].code = scan.nextInt();
            System.out.println("Enter specialist category: ");
            s[i].s = scan.next();
            s[i].display();
        }
        
        System.out.println("\n\nINTERFACES AND ABSTRACT CLASSES PART: ");
        Employee e1 = new Employee();
        System.out.println("\nEnter Employee Class details: ");
        System.out.println("Enter name: ");
        e1.name = scan.next();
        System.out.println("Enter age: ");
        e1.age = scan.nextInt();
        System.out.println("Enter sex (M/F): ");
        e1.sex = scan.next();
        System.out.println("Enter employee code: ");
        e1.code = scan.nextInt();
        
        // IMPLEMENTATION OF INTERFACES:
        e1.get_interface();
        e1.salary_calculate();
        e1.leave_approval();
    }
}


// ABSTRACT CLASSES CODE ATTEMPTED:

/*interface calculate {
    public void salary_calculate();
    public void leave_approval();
}

abstract class details {
    abstract void calculate_age();
    abstract void calculate_experience();
    abstract void display();
}

class Person {
    int age;
    String name;
    String sex;
}

class Employee extends Person implements calculate,details {
    Scanner scan1 = new Scanner(System.in);
    int code;
    int daily_wage;
    int days;
    int salary;
    String leave;
    String dob;
    String curr_date;
    String starting_date;
        
    void display() {
        System.out.println("\nEMPLOYEE Class: ");
        System.out.println("Name: " + name + "\nAge: " + age + "\nSex: " + sex + "\nEmployee code: " + code);
    }
    
    void get_interface() {
        System.out.println("\nEnter daily wage: ");
        daily_wage = scan1.nextInt();
        System.out.println("Enter days present: ");
        days = scan1.nextInt();
        System.out.println("Enter decision on leave approval (yes or no): ");
        leave = scan1.next();
    }
    
    void get_abstract() {
        System.out.println("\nEnter date of birth in dd/mm/yyyy format: ");
        dob = scan1.next();
        System.out.println("Enter current date in dd/mm/yyyy format: ");
        curr_date = scan1.next();
        System.out.println("Enter first day of work in dd/mm/yyyy format: ");
        start_date = scan1.next();
    }
    
    public void salary_calculate() {
        salary = daily_wage*days;
        System.out.println("\nSalary is " + salary);
    }
    
    public void leave_approval() {
        if (leave.equalsIgnoreCase("yes")) {
            System.out.println("Leave request APPROVED.");
        }
        else {
            System.out.println("Leave request DENIED.");
        }
    }
    
    public void calculate_age() {
        System.out.println("\nAge is: " + (Integer.parseInt(curr_date.substring(6))-Integer.parseInt(dob.substring(6))));
    }
    
    public void calculate_experience() {
        System.out.println("\nExperience is: " + (Integer.parseInt(curr_date.substring(6))-Integer.parseInt(start_date.substring(6))));
    }
}

class Specialist extends Employee implements details {
    String s;
    
    void display() {
        System.out.println("\nSPECIALIST Class: ");
        System.out.println("Name: " + name + "\nAge: " + age + "\nSex: " + sex + "\nEmployee code: " + code + "\nSpecialist category: " + s);
    }
}

public class _5d_1_person_emp_spe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee[] e = new Employee[3];
        Specialist[] s = new Specialist[3];
        for (int i=0; i<3; i++) {
            e[i] = new Employee();
            System.out.println("\nEnter EMPLOYEE Class " + (i+1) + " details: ");
            System.out.println("Enter name: ");
            e[i].name = scan.next();
            System.out.println("Enter age: ");
            e[i].age = scan.nextInt();
            System.out.println("Enter sex (M/F): ");
            e[i].sex = scan.next();
            System.out.println("Enter employee code: ");
            e[i].code = scan.nextInt();
            e[i].display();
            
            s[i] = new Specialist();
            System.out.println("\nEnter SPECIALIST Class " + (i+1) + " details: ");
            System.out.println("Enter name: ");
            s[i].name = scan.next();
            System.out.println("Enter age: ");
            s[i].age = scan.nextInt();
            System.out.println("Enter sex (M/F): ");
            s[i].sex = scan.next();
            System.out.println("Enter employee code: ");
            s[i].code = scan.nextInt();
            System.out.println("Enter specialist category: ");
            s[i].s = scan.next();
            s[i].display();
        }
        
        System.out.println("\n\nINTERFACES AND ABSTRACT CLASSES PART: ");
        Employee e1 = new Employee();
        System.out.println("\nEnter Employee Class details: ");
        System.out.println("Enter name: ");
        e1.name = scan.next();
        System.out.println("Enter age: ");
        e1.age = scan.nextInt();
        System.out.println("Enter sex (M/F): ");
        e1.sex = scan.next();
        System.out.println("Enter employee code: ");
        e1.code = scan.nextInt();
        
        // IMPLEMENTATION OF INTERFACES:
        e1.get_interface();
        e1.salary_calculate();
        e1.leave_approval();
        
        //IMPLEMENTATION OF ABSTRACT CLASS:
        e1.get_abstract();
        e1.calculate_age();
        e1.calculate_experience();
    }
} */