import java.util.*;
public class Strings{
    public static void main(String args[]){
        char arr[]= {'a','b','c','d'};
        String str= "abcd";
        String str2= new String ("xyz");
        
        // Strings are immutable
        Scanner sc = new Scanner(System.in);
        String name;
        name=sc.nextLine();
        name= sc.next();
        
        System.out.println(name);
        
        
    }
}




// calculating the length of string


import java.util.*;
public class Strings{
    public static void main(String args[]){
      /*  char arr[]= {'a','b','c','d'};
        String str= "abcd";
        String str2= new String ("xyz");
        
        // Strings are immutable
        Scanner sc = new Scanner(System.in);
        String name;
        name=sc.nextLine();
        name= sc.next();
        
        System.out.println(name);*/
        String fullName= "Tony Stark";
        System.out.println(fullName.length());
        
        
    }
}


java -cp /tmp/jsaZgRPW1I/Strings
10

=== Code Execution Successful ===

// concatenation in java



import java.util.*;
public class Strings{
    public static void main(String args[]){
      /*  char arr[]= {'a','b','c','d'};
        String str= "abcd";
        String str2= new String ("xyz");
        
        // Strings are immutable
        Scanner sc = new Scanner(System.in);
        String name;
        name=sc.nextLine();
        name= sc.next();
        
        System.out.println(name);*/
         /*String fullName= "Tony Stark";
        System.out.println(fullName.length());*/
        String firstName = "Shradha";
        String lastName="Khapra";
        String fullName=firstName+""+lastName;
        System.out.println(fullName);
        
        
    }
}

java -cp /tmp/G0vFkjEymE/Strings
ShradhaKhapra

=== Code Execution Successful ===