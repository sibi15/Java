import java.util.*;

class _3a_8_vectors {
    public static void main(String[] args) {
        System.out.println("\nVectors: ");
        Scanner s = new Scanner(System.in);
        Vector <Integer> vec = new Vector <>();
        String check = "yes";
        int element,index;

        
        while (check.equalsIgnoreCase("yes")) {
            System.out.println("\nOperations:\n1. Addition of elements\n2. Updation of elements\n3. Removal of elements\n4. Display vector\n");
            int choice = s.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("\nEnter element to insert into vector: ");
                    element = s.nextInt();
                    vec.add(element);
                    System.out.println("\nElement inserted.");
                    break;
            
                case 2:
                    System.out.println("\nEnter element to be updated: ");
                    element = s.nextInt();
                    if (vec.contains(element)) {
                        index = vec.indexOf(element);
                        System.out.println("Enter new element: ");
                        element = s.nextInt();
                        vec.set(index,element);
                    }
                    else {
                        System.out.println("\nElement to be updated NOT present in vector.");
                        break;
                    }
                    System.out.println("\nElement updated.");
                    break;

                case 3: 
                    System.out.println("\nEnter element to be removed: ");
                    element = s.nextInt();
                    if (vec.contains(element)) {
                        vec.remove((Integer)element);
                    }
                    else if (vec.isEmpty()) {
                        System.out.println("\nVector empty.");
                        break;
                    }
                    else {
                        System.out.println("\nElement to be removed NOT present in vector.");
                        break;
                    }
                    System.out.println("\nElement removed.");
                    break;

                case 4:
                    System.out.println("\nVector elements are: ");
                    Iterator it = vec.iterator();
                    while (it.hasNext()) {
                        System.out.println(it.next());
                    }
                    break;

                default:
                    System.out.println("\nWrong input. ");
            }
            
            System.out.println("\nTo continue type 'yes', else type anything else: ");
            check = s.next();
        }
    }
}

                    
        // Adding elements:

        // System.out.println("\nEnter no. of elements to add to vector: ");
        // int n = s.nextInt(); System.out.println("\n");
        // int i = 0, element = 0, index = 0;
        
        
        // while (i<n) {
        //     System.out.println("Enter element " + (i+1) + " to insert into vector: ");
        //     element = s.nextInt();
        //     vec.add(element);
        //     i++;
        // }
        // System.out.println("\nElements inserted.");

        // Updating elements:

        // System.out.println("\nEnter no. of elements to update in vector: ");
        // n = s.nextInt(); System.out.println("\n");
        // i=0;

        // while (i<n) {
        //     System.out.println("\nEnter element to be updated: ");
        //     element = s.nextInt();
        //     index = vec.indexOf(element);
        //     System.out.println("Enter new element: ");
        //     element = s.nextInt();
        //     vec.set(index,element);
        //     i++;
        // }
        // System.out.println("\nElements updated.");

        // Removing elements:

        // System.out.println("\nEnter no. of elements to remove in vector: ");
        // n = s.nextInt(); System.out.println("\n");
        // i=0;

        // while (i<n) {
        //     System.out.println("Enter element to be removed: ");
        //     element = s.nextInt();
        //     vec.remove(element);
        //     i++;
        // }
        // System.out.println("\nElements removed.");

        // Iterating over elements:

        //System.out.println("Vector is: " + vec);
    //}
    
//}