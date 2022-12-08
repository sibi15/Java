import java.util.*;

class details {
    public int eid;
    public String name;
}

class p extends details {
    private int product;
    private int amt;
    private static int t_amt=0,t_product=0;
    public void get() {
        Scanner s = new Scanner (System.in);
        System.out.printf("\nEnter Customer ID: ");
        eid = s.nextInt();
        System.out.printf("\nEnter Customer Name: ");
        name = s.next();
        System.out.printf("\nEnter total items purchased: ");
        product = s.nextInt();
        System.out.printf("\nEnter total amount: ");
        amt = s.nextInt();
        t_amt=t_amt+amt;
        t_product=t_product+product;
    }
    public void show() {
        System.out.printf("No of items purchased: "+product);
        System.out.printf("\nPurchase amount: "+amt);
    }
    public void display() {
        System.out.printf("\nTotal amount recieved: "+t_amt);
        System.out.printf("\nTotal items sold: "+t_product);
    }
}

class _4_5_supermarket_class {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int t=0;
        System.out.printf("\nEnter the number of customers: ");
        t = s.nextInt();
        p[] c = new p[t]; 
        for (int i=0; i<t; i++){
            c[i]=new p();
        }
        for (int i=0; i<t; i++){
            c[i].get();
        }
        System.out.printf("\nPurchase Details:\n");
        for (int i=0;i<t;i=i+1){
            System.out.printf("Customer "+i+1);
            c[i].show();
        }
        c[0].display();
    }
}
