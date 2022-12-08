import java.util.*; 
public class _4_1_emp_list_stack {
    
    static class Stack {
        private int arr[];
        private int top;
        private int capacity;
        Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
    }
    
    public void push(int x) {
        if (top == capacity) {
            System.out.println("\nStack OverFlow");
            return; 
        }
        System.out.println("\nInserting " + x);
        arr[++top] = x;
    }
    
    public int pop() {
        if (top == -1) {
            System.out.println("\nStack is Empty");
            return -1;
        }
        return arr[top--];
    }
    
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
 
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter choice:\n1. Stack\n2. List\n");
    int choice = sc.nextInt();
    
    if (choice == 1) {
        Stack emp_ID = new Stack(100);
        Stack emp_Salary = new Stack(100);
        // Calling push function
        System.out.println("\nEnter the number of Employees: "); 
        int n = sc.nextInt();
        System.out.println("\nEnter employee information: ");
        
        for (int i = 0; i<n; i++) {
            System.out.print("\nEmployee ID of Employee " + (i + 1) + ": ");
            emp_ID.push(sc.nextInt());
            System.out.print("\nEmployee Salary of Employee " + (i + 1) + ": ");
            emp_Salary.push(sc.nextInt());
        }

        System.out.println();
        System.out.println("\nEmployee information retrieved from the stack: ");
        
        for(int i = 0; i<n; i++) {
            System.out.println("Employee ID of Employee " + (i + 1) + ": "
            + emp_ID.pop());
            System.out.println("Employee Salary of Employee " + (i + 1) + ": " + emp_Salary.pop()); 
        }
    }

    else if (choice == 2) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        System.out.println("\nEnter the number of Employees: ");
        int n = sc.nextInt();
        System.out.println("\nEnter employee information: ");
        
        for (int i = 0; i<n; i++){
            System.out.print("\nEmployee ID of Employee " + (i + 1) + ": "); 
            list1.add(sc.nextInt());
            System.out.print("\nEmployee Salary of Employee " + (i + 1) + ": ");
            list2.add(sc.nextInt());
        }

        System.out.println();
        System.out.println("\nEmployee information retrieved from the List: ");
        
        for (int i = 0; i<n; i++){
            System.out.println("Employee ID of Employee " + (i + 1) + " " + list1.get(i));
            System.out.println("Employee Salary of Employee " + (i + 1) + " " + list2.get(i));
        }
    }
    }
}