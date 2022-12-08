import java.util.*;
class _7b_arraylist_hashmap {
    public static void main (String[] args) {
        // 1:  
        // ArrayLists -> any number of duplicate elements

        ArrayList<String> list = new ArrayList<String>();
        list.add("X");
        list.add("Y");
        list.add("Y");
        list.add("X");
        list.add("Z");
        System.out.println("\n1.\n> ArrayList is: " + list);
        System.out.println("Duplicate elements are " + list.get(0) + " and " + list.get(1) + ".");
        System.out.println("Appearing " + Collections.frequency(list,list.get(0)) + " and " + Collections.frequency(list,list.get(1)) + " times respectively.");

        // HashMaps -> duplicate values allowed
        //          -> duplicate keys not allowed

        HashMap<Integer,String> hm_1 = new HashMap<Integer,String>();
        hm_1.put(1, "X");
        hm_1.put(2, "X");
        hm_1.put(3, "Y");
        hm_1.put(4, "Z");
        System.out.println("\n> HashMap 1 is: " + hm_1);

        HashMap<Integer,String> hm_2 = new HashMap<Integer,String>();
        hm_2.put(1, "X");
        hm_2.put(2, "X");
        hm_2.put(3, "Y");
        hm_2.put(3, "Z");
        System.out.println("> HashMap 2 is: " + hm_2);

        // 2: (HashSet to ArrayList)

        HashSet<String> set = new HashSet<>();
        set.add("xyz");
        set.add("abc");
        ArrayList<String> hashset_to_arraylist = new ArrayList<>(set);
        System.out.println("\n2.\nHashSet now ArrayList is: " + hashset_to_arraylist);
    
        // 3 (replacing elements)

        Scanner scan = new Scanner(System.in);
        System.out.println("\n3.\nEnter index of element to swap: ");
        int index = scan.nextInt();
        System.out.println("Enter element to swap original element with: ");
        String s = scan.next();
        System.out.println("\nArrayList before change: " + list);
        list.set(index,s);
        System.out.println("ArrayList after change: " + list);
    }
}