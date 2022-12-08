import java.util.*;
class _1a_4_area_of_circle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter radius of circle: ");
        double pi=3.14,area;
        double radius = s.nextDouble();
        area = pi*radius*radius;
        System.out.println("\nArea of circle is " + area + " unit^2.\n");
    }
}
