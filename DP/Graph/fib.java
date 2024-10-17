public class Main {
    public static int fib(int n) {
        //base case
        if (n == 0 || n == 1) {
            return n;
        }

        // recursive case
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
}