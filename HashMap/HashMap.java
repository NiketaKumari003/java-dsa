import java.util.*;
public class HashMapCode{
    static  class HashMap<K,V>{
        private class Node
        {
        //generic
        K key;
        V value;
        public Node (K key, V value){
            this.key= key;
            this.value= value;
        }
    }
    private int size;//n
    private int n;//n
    private int N;
    private LinkedList<Node>buckets[];//N=buckets.length
    
    @SuppressWarnings ("unchecked")
    public HashMap(){
        this.N=4;
        this.buckets= new LinkedList[4];
        for(int i=0;i<4;i++){
            this.bucket[i]= new LinkedList<>();
        }
    }
    private int hashFunction(K key){
        int hc= key.hashCode();
       return  Math.abs(hc)%buckets.length;
    }
    private int SearchInLL( K key,int bi){
     LinkedList<Node>ll= buckets[bi];
     int di=0;
     for(int i=0;i<ll.Size();i++){
         Node node ==ll.get(i);
         if(node.key == key){
           return di;  
         }
         di++;
     }
     return -1;
        
    }
    public void put( K key, V value){
        int bi= hashFunction(key);// 0-3
        int di=SearchInLL(key,bi);// valid index milega
        if(di != -1){
            Node node = buckets[bi].get(di);
            node.value= value;
        }
        else{
            buckets[bi].add(new Node(key,value));
            n++;
        }
        // rehashing function in java
        double lamda=n/N;
    }
    public boolean containsKey( K key){
        return false;
    }
    else{
      
    }
    public V remove( K key){
        return null;
    }
    public V get( K key){
        return null;
    }
    public ArrayList<K>keySet(){
        
    }
}