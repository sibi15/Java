import java.util.*;
import static java.lang.Math.sqrt;

class GeometricObject{
    String color;
    boolean isFill;
    
    String getColor()   {
        return color;
    }
    boolean isFilled()  {
        return isFill;
    }   
    GeometricObject() {
    }
}

class Triangle extends GeometricObject{
    double s1,s2,s3;
    double area=0,semi_p;
    
    Triangle() {
        s1=1;
        s2=1;
        s3=1;
    }

    Triangle(double side1,double side2,double side3) {
        s1=side1;
        s2=side2;
        s3=side3;
    }

    double getArea() {
        semi_p=(s1+s2+s3)/2;
        area=sqrt(semi_p*(semi_p-s1)*(semi_p-s2)*(semi_p-s3));
        return area;
    }   

    double getPerimeter() {
        return s1+s2+s3;
    }

    void display() {
        System.out.println("\nArea of the triangle is " + getArea() + " unit^2.");
        System.out.println("\nPerimeter of the triangle is " + getPerimeter() + " units.");
        System.out.println("\nColor of the triangle is " + getColor() + ".");
        if (isFilled()) {
            System.out.println("\nTriangle is filled.\n");
        }
        else {
            System.out.println("\nTriangle is not filled.\n");
        }
    }
}

public class _5a_1_geometry_classes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GeometricObject g = new GeometricObject();
        Triangle t = new Triangle();
        System.out.println("\nEnter 3 sides of the triangle: ");
        t.s1 = s.nextDouble();
        t.s2 = s.nextDouble();
        t.s3 = s.nextDouble();
        System.out.println("\nEnter color of triangle: ");
        t.color = s.next();
        System.out.println("\nEnter true/false for filled or not:");
        t.isFill = s.nextBoolean();
        t.display();
    }
}
