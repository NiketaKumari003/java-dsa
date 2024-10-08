import java.util.*;
public class Main{
    
        public static void main(String args[]){
            LinkedHashMap<String,Integer>lhm= new LinkedHashMap<>();
            lhm.put("India",150);
            lhm.put("China",150);
            lhm.put("US",50);
            System.out.println(lhm);
        
    }
}

// output:-

java -cp /tmp/L5mFSQYWq4/Main
{India=150, China=150, US=50}

=== Code Execution Successful ===



import java.util.*;
public class Main{
    
        public static void main(String args[]){
            LinkedHashMap<String,Integer>lhm= new LinkedHashMap<>();
            lhm.put("India",150);
            lhm.put("China",150);
            lhm.put("US",50);
            System.out.println(lhm);
            HashMap<String,Integer>hm= new HashMap<>();
            hm.put("India",100);
            hm.put("China",150);
            hm.put("US",50);
            System.out.println(hm);
        
    }
}


java -cp /tmp/mjZc31SalG/Main
{India=150, China=150, US=50}
{China=150, US=50, India=100}

=== Code Execution Successful ===
// linked hashmap uses doubly linkedlist data structure
// it maintains the insertion order