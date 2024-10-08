// factorial of number 
public static void main(String args[]){
    int num;
    int fact=1;
    System.out.println("Enter any positive number:");
    num= sc.nextInt();


    for(int i=1;i<=num;i++){
        fact *= i;
    }
    System.out.println("Factorail of number:"+fact);
}


import java.util.*;
public class Fibonacci{
    static int fibo(int n){
        if(n==1)
        return 0;
        if(n==2)
        return 1;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String args[]){
        int ans= fibo(7);
        System.out.println(ans);
    }
} 
// four step to solve any recursive problem
what is your expectation from function
Assume that your function will work properly or smaller problem
Solve the whole problem (work from faith expectation)