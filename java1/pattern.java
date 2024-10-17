import java.util.*;
public class Main{
    public static void main(String args[]){
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
}



//variables in java
public class Java{
    public static void main(String args[]){
        int a=10;
        int b=5;
        System.out.println(a);
        System.out.println(b);
    }
}



//datatypes in java
public class Java{
    public static void main(String args[]){
        byte b=8;
        System.out.println(b);
        char ch='a';
        System.out.println(ch);
        boolean var=false;
        float price=10.5;
        int number=25;
        //long
        //double
        short n=240;
    }
}




// sum of a & b
public class Java{
    public static void main(String args[]){
        int a=10;
        int b=5;
        int sum=a+b;
        System.out.println(sum);
    }
}


// input in java
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String input=sc.next();
        System.out.println(input);
    }
}




//sum of a & b
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }
}



// product of a & b
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int product=a*b;
        System.out.println(product);
    }
}

// Area of the circle
// area of the circle
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        float rad=sc.nextFloat();
        float area= 3.14f*rad*rad;// to take double into float
        System.out.println(area);
    }
}


//type conversion in java
import java.util.*;
public class Main{
    public static void main(String args[]){
        int a=25;
        int b=a;
        System.out.println(b);
    }
}


//type casting in java
import java.util.*;
public class Main
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        float a =25.12f;
        int b=(int)a;
        System.out.println(b);
    }
}