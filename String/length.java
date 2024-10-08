public class Strings{
    public static void main(String args[]){
        String fullName="Niketa Kumari";
        System.out.println(fullName.length());
    }
}

// Concatenation of string
public class Strings{
    public static void main(String args[]){
        /*String fullName="Niketa Kumari";
        System.out.println(fullName.length());*/
        //concatenation
        String firstName="Niketa";
        String lastName="Kumari";
        String fullName= firstName+""+lastName;
        System.out.println(fullName);
    }
}


// to find the position of string 
public class Strings {
    public static void main(String[] args) {
        // Concatenation
        String firstName = "Niketa";
        String lastName = "Kumari";
        String fullName = firstName + " " + lastName;

        // Print the character at a specific index (e.g., the first character)
        System.out.println(fullName.charAt(0));
    }
}