import java.util.*;
//Pairs in an Array
public class ArraysCC{
    public static void printPairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];//2 4 6 8 10
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        printPairs(numbers);
    }
}


java -cp /tmp/iEtjCl6vkK/ArraysCC
(2,4)(2,6)(2,8)(2,10)
(4,6)(4,8)(4,10)
(6,8)(6,10)
(8,10)


=== Code Execution Successful ===