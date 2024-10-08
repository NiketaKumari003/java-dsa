import java.util.*;
class Main{
    public static void main(String args[]){
        PriorityQueue<Integer>pq= new PriorityQueue<>();
        // maximum PriorityQueue
        PriorityQueue<Integer>maxPQ= new PriorityQueue<>
        (Collections.reverseOrder());
        
        
        
        
        pq.add(2);
        pq.add(32);
        pq.add(44);
        pq.add(15);
        pq.add(-10);
        
        
        maxPQ.add(2);
        maxPQ.add(32);
        maxPQ.add(44);
        maxPQ.add(15);
        maxPQ.add(-10);
        System.out.println(pq.peek());
        System.out.println(maxPQ.peek());
    }
}