import java.util.*;

//class _4_2_arithmetic_delegates {
 
class Arithmetic {
    float n1,n2,n3;
    Arithmetic(float n1,float n2,float n3) {
        this.n1=n1;
        if(n3==1)
            add(n1,n2);
        else if(n3==2)
            sub(n1,n2);
        else if(n3==3)
            mul(n1,n2);
        else if(n3==4)
            div(n1,n2);
        else
            System.out.println("\nEnter operation: ");
    }

    public static void add(float n1,float n2){
        System.out.println("\n"+n1+" + "+n2+" = "+(n1+n2));}
    public static void sub(float n1,float n2){
        System.out.println("\n"+n1+" - "+n2+" = "+(n1-n2));}
    public static void mul(float n1,float n2){
        System.out.println("\n"+n1+" * "+n2+" = "+(n1*n2));}
    public static void div(float n1,float n2){
        System.out.println("\n"+n1+" / "+n2+" = "+(n1/n2));}}

class _4_2_arithmetic_delegates {
    public static void main(String args[]) {
        Scanner get=new Scanner(System.in);
        int ch=1;
        while (ch==1) {
            System.out.print("\nEnter 1st number: ");
            float num1=get.nextInt();
            System.out.print("Enter 2nd number: ");
            float num2=get.nextInt();
            System.out.print("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter operation to perform: ");
            float op=get.nextInt();
            
            Arithmetic ar =new Arithmetic(num1,num2,op);
            System.out.print("\nEnter\n1. Continue\n0. Exit:\n ");
            ch=get.nextInt();
        }
        get.close();
    }
}