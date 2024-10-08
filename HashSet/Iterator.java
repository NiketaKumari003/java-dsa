import java.util.*;
public class Main{
    public static void main(String args[]){
        HashSet<String>cities= new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        Iterator it= cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}




java -cp /tmp/6UGwATwnNW/Main
Delhi
Bengaluru
Noida
Mumbai

=== Code Execution Successful ===






import java.util.*;
public class Main{
    public static void main(String args[]){
        HashSet<String>cities= new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
       /* Iterator it= cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
        
        
        for(String city:cities){
            System.out.println(city);
        }
    }
}




java -cp /tmp/ypZPJ9CbOt/Main
Delhi
Bengaluru
Noida
Mumbai

=== Code Execution Successful ===