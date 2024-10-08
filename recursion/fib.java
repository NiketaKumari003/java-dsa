public class Main{
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        
        
        
        System.out.println(n+"");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        printInc(n-1);
        System.out.println(n+"");
    }
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fact(n-1);
        return fn;
    }
    public static int calcSum(int n ){
        if(n==1){
            return 1;
        }
       int Snm1= calcSum(n-1); 
       int Sn=n+Snm1;
       return Sn;
    }
    // calculate nth term in fibonacci number
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=fib(n-1);//1
        int fnm2=fib(n-2);//2
        int fn=fnm1+fnm2;
        return fn;
    }
    
    public static void main(String args[]){
        int n=5;
        System.out.println(fib(n));
    }
}


//output:5