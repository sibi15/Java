import java.util.*;

class Person {
    Scanner scan = new Scanner(System.in);
    String name;
    String address;
    int phone_num;
    String email;

    void get() {
        System.out.println("\nEnter name: ");
        name = scan.next();
        System.out.println("\nEnter address: ");
        address = scan.next();
        System.out.println("\nEnter phone number: ");
        phone_num = scan.nextInt();
        System.out.println("\nEnter email address: ");
        email = scan.next();
    }

    void display() {
        System.out.println("\nPERSON: ");
        System.out.println("Name is: " + name);
        System.out.println("Address is: " + address);
        System.out.println("Phone number is: " + phone_num);
        System.out.println("Email ID is: " + email);
    }
}

class Student extends Person {
    String status;
    
    void get() {
        System.out.println("\nEnter status: ");
        final String status = scan.next(); 
    }

    void display() {
        System.out.println("\nSTUDENT: ");
        System.out.println("Name is: " + name);
        System.out.println("Status is: " + status);
    }
}

class Employee extends Person {
    String office;
    double salary;
    String doh;

    void get() {
        System.out.println("\nEnter office: ");
        office = scan.next(); 
        System.out.println("\nEnter salary: ");
        salary = scan.nextDouble();
        System.out.println("\nEnter date of hiring (dd/mm/yyyy): ");
        doh = scan.next();
    }

    void display() {
        System.out.println("\nEMPLOYEE: ");
        System.out.println("Name is: " + name);
        System.out.println("Office is: " + office);
        System.out.println("Salary is: " + salary);
        System.out.println("Date of hiring is: " + doh); 
    }
}

class Faculty extends Employee {
    int office_hrs;
    String rank;

    void get() {
        System.out.println("\nEnter office hours: ");
        office_hrs = scan.nextInt(); 
        System.out.println("\nEnter rank: ");
        rank = scan.next();
    }

    void display() {
        System.out.println("\nFACULTY: ");
        System.out.println("Name is: " + name);
        System.out.println("Office hours is: " + office_hrs);
        System.out.println("Rank is: " + rank);
    }
}

class Staff extends Employee {
    String title;

    void get() {
        System.out.println("\nEnter title: ");
        title = scan.next();
    }

    void display() {
        System.out.println("\nSTAFF: ");
        System.out.println("Name is: " + name);
        System.out.println("Title is: " + title);
    }
}

public class _5b_1_person_employee_student {
    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();
        Employee e = new Employee();
        Faculty f = new Faculty();
        Staff st = new Staff();
        p.get(); s.get(); e.get(); f.get(); st.get(); 
        p.display(); s.display(); e.display(); f.display(); st.display(); 
    }  
}
