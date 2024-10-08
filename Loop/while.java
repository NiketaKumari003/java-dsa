int curr_num=1;
int n= sc.nextInt();
while(curr_num<=n){
    System.out.println(curr_num);
    curr_num++;
}

// output: 1 2 3 4 5 




import java.util.*;
public class Main{
    public static void main(String args[]){
        int i=0,j=10;
       /* while(i<j){
            System.out.println(i+","+j);
            i++;
            j--;*/
            for( i=0;i<j;i++,j--){
                System.out.println("i="+i+"j="+j);
            }
        }
    
}


// example of palindrome number


import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        boolean answer = isPalindrome(num);
        System.out.println(answer);
    }
    
    public static boolean isPalindrome(int input) {
        int num = input;
        int reverse = 0;
        while (input != 0) {
            int lastDigit = input % 10;
            input = input / 10;
            reverse = reverse * 10 + lastDigit;
        }
        if (reverse == num) {
            return true;
        } else {
            return false;
        }
    }
}
java -cp /tmp/LswpMoCmrW/Solution
1234321
true

=== Code Execution Successful ===