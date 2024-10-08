// iteration in keyset
import java.util.*;
public class Main{
    public static void main(String args[]){
        HashMap<String,Integer>hm= new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Indonesai",6);
        hm.put("Nepal",5);
        
        
        // Iterate
        Set<String>keys= hm.keySet();
        System.out.println(keys);
    }
}


// output:-
java -cp /tmp/gQdnk12ZC3/Main
[China, US, Nepal, India, Indonesai]

=== Code Execution Successful ===