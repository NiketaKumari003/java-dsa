import java.util.*;
public class Main{
    static class Node{
        Node children[]= new Node[26];
        boolean eow= false;
        
        
        // making of the constructor
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root= new Node();
    //root always remain empty
    public static void insert(String  word){
        Node curr= root;
        for(int level=0;level<word.length();level++){
            int idx= word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]= new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow= true;
    }
    public static boolean search(String key){
        Node curr=root;
        for(int level=0;level<key.length();level++){
            int idx=key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr= curr.children[idx];
        }
        return curr.eow= true;
    }
    public static boolean wordBreak(String key){
        // base case for given problem
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            //substring (0,i)
          if(search(key.substring(0,i))&&
           wordBreak(key.substring(i))){
              return true; 
           }
            
        }
        return false;
    }
    public static void main(String args[]){
        String arr[]= {"i","like","sam","samsung","mobile","ice"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
       String key="ilikesamsung"; 
       System.out.println(wordBreak(key));
    }
}


java -cp /tmp/Ct95u9NOVZ/Main
true

=== Code Execution Successful ===