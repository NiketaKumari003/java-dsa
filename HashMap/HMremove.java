import java.util.*;
public class Main{
    public static void main(String args[]){
        // Craete
        HashMap<String,Integer>hm= new HashMap<>();
        
        //Insert-O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        System.out.println(hm);
        
        
        // get operation -O(1)
      
       // int popu=hm.get("China");
       // System.out.println(popu);
        //System.out.println(hm.get("Indonesia"));
        
        //ContainsKey-O(1)
       // System.out.println(hm.containsKey("India"));// true
        //System.out.println(hm.containsKey("Indonesia"));//false
        
        // Remove 
        System.out.println(hm.remove("China"));
        System.out.println(hm);
        
        
        
        
    }
}




java -cp /tmp/Og2bbcZHXi/Main
{China=150, US=50, India=100}
150
{US=50, India=100}

=== Code Execution Successful ===