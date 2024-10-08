public class Main
{
    public static void main(String args[]){
        String fruits[]={"apple","mongo","banana"};
        String largest= fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest= fruits[i];
                
            }
        }
        System.out.println(largest);
    }
}


// stringBuilder
public class Main{
    public static void main(String args[]){
        StringBuilder sb= new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}


java -cp /tmp/jQjtQzqG97/Main
abcdefghijklmnopqrstuvwxyz

=== Code Execution Successful ===