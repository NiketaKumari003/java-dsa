import java.util.*;

public class Main {
    public static void main(String args[]) {
        // creating khali hashmap
        HashMap<String, Integer> hm = new HashMap<>();

        // insertion operation
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);
    }
}

// hashmap :unordered map inside java




import java.util.*;

public class Main {
    public static void main(String args[]) {
        // creating khali hashmap
        HashMap<String, Integer> hm = new HashMap<>();

        // insertion operation
        // time complexity:-O(N)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // get-O(N)

        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));
    }
}
// output:-


java -cp /tmp/ej4gLoyWIg/Main
{China=150, US=50, India=100}
100
null

=== Code Execution Successful ===