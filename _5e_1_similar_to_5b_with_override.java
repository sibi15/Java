import java.util.*;

public class _5e_1_similar_to_5b_with_override {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String name;
        String[] names = {"Person", "Student", "Employee", "Faculty", "Staff"};
        String[] names_new = new String[5];
        for (int i=0; i<names.length; i++) {
            System.out.println("\nEnter " + names[i].toUpperCase() + " Class NAME:");
            name = s.nextLine();
            names_new[i] = name;
        }
		Person person = new Person(names_new[0]), student = new Student(names_new[1]), 
        employee = new Employee(names_new[2]), faculty = new Faculty(names_new[3]), 
        staff = new Staff(names_new[4]), classes[] = {person, student, employee, faculty, staff};
		MyDate dateHired = new MyDate(names_new[2]);
        for (Person main:classes)
			System.out.println(main);
	}
}

class Person {
	String name, address, phone_num, email_id;

	Person(String n) {
		name = n;
	}

	@Override
	public String toString() {
		return "\nPERSON CLASS: " + name;
	}
}

class Student extends Person {
	Student(String n) {
		super(n);
	}

	enum Status {
		freshman, sophomore, junior, senior
	}

	Status classStatus;

	@Override
	public String toString() {
		return "STUDENT CLASS: " + name;
	}
}


class MyDate extends Person {
    String month, day, year;

    public MyDate(String n) {
        super(n);
    }
}

class Employee extends Person {
	Employee(String n) {
		super(n);
	}

	String office, hire_date;
	double salary;

	@Override
	public String toString() {
		return "EMPLOYEE CLASS: " + name;
	}
}

class Faculty extends Employee {
	Faculty(String n) {
		super(n);
	}

	String office_hrs, rank;

	@Override
	public String toString() {
		return "FACULTY CLASS: " + name;
	}
}

class Staff extends Employee {
	Staff(String n) {
		super(n);
	}

	String title;

	@Override
	public String toString() {
		return "STAFF CLASS: " + name;
	}
}