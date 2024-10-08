import java.util.*;
public class Main{
    public static void main(String args[]){
        HashMap<String,Integer>hm= new HashMap<>();
        //insert -O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        System.out.println(hm);
        //Size
        System.out.println(hm.size());
        //Is empty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}