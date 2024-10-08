public class OOPS{
    public static void main(String args[]){
      Horse h = new Horse();
      h.eat();
      h.walk();
      Chicken c= new Chicken();
      c.walk();
      c.eat();
    }
}
abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends  Animal {
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal {
    void walk(){
        System.out.println("walks on 2 legs");
    }
    
    
}



java -cp /tmp/Vy6OFu4fUh/OOPS
animal eats
walks on 4 legs
walks on 2 legs
animal eats

=== Code Execution Successful ===