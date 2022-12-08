import java.util.*;
public class _4_4_class_members_sample {
    static int static_num = 0;
    int instance;
    public _4_4_class_members_sample(int i) { 
        instance = i;
	    static_num++;
    }
    
    public void show() { 
	    System.out.println("\nValue of Static Number is:" + static_num + "\nValue of Instance number is:" + instance);
    }
    
    public static int cube() { 
    	return static_num * static_num * static_num;
    }
    public static void main(String args[]){
	    _4_4_class_members_sample s1 = new _4_4_class_members_sample(10);
	    System.out.println("\nValue after s1 object creation: ");
	    s1.show();
	    _4_4_class_members_sample s2 = new _4_4_class_members_sample(20);
	    System.out.println("\nValue after s2 object creation: ");
	    s2.show();

	    int cube_ =_4_4_class_members_sample.cube();
	    System.out.println("\nCube of the Static number is: " + cube_);
    }
}