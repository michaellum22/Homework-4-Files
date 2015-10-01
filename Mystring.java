import java.util.Scanner;
import java.util.*;

public class Mystring {
    
    private static char[] mystring;
    private Mystring test1;
    private int len = 0;
    public Mystring(char[] chars) {
        
        mystring = chars;
        
        
    }
    public Mystring getMyString(){ // returns the string
        
        final Mystring test1 = new Mystring(mystring);
         return test1;
        
    }
    public String toString(){ // Converts char array to string
    	final  String stringValueOf = String.valueOf(mystring);
        return stringValueOf;
    }
    public char charAt(int index) { // Finds the value stored at the index provided
        return mystring[index];
    }
    public int length() { // Finds the length of the object array
        
        while (mystring[len] != '\0') // Finds the end of the object array
            len++;
        return len;
    }
    public Mystring toUpperCase() //Uppercase version of the object array
    {
        char[] local;
        local = new char[len];
            for (int j = 0; j < len; j++){
                
            local[j] =  Character.toUpperCase(mystring[j]); 
            }
           
            final  Mystring upper = new Mystring(local);
            return upper;
    }
    
    public Mystring toLowerCase() //Lowercase version of the object array
    { char[] local;
    local = new char[len];
        for (int j = 0; j < len; j++){
            
        local[j] =  Character.toLowerCase(mystring[j]);
          
        }
        
        final Mystring lower = new Mystring(local);
        return lower;
    }
    
    
    
    public Mystring substring(int begin, int end) { // Creates a substring of the array
        char[] sub;
        sub = new char [end-begin];
        int j = 0;
        for (int i = begin; i < end; i++) {
            sub[j] = mystring[i];
            j++;
        }
        final Mystring newstring = new Mystring(sub);
       
        return newstring;
        
    }
    public boolean equals (Mystring s) // Checks if arrays are equal. For some reason it doesn't work even though I checked the logic
    {
    	final Mystring local = new Mystring(mystring);
        if (local == s)
        {
        	System.out.println(local + " and  " + s + " are the same"); 
        	return true;
        }
        System.out.println(local + " and  " + s + " are different");    
        return false;
    }
    
    public static Mystring valueOf(int i) // Finds the value of the the int and returns the character
    {
    	char[] local;
        local = new char[1];
    	local[0] = Character.valueOf(mystring[i]);
    	final	Mystring valueof1 = new Mystring(local);
    	return valueof1;
    }
    
    public static void main(String[] args) { // Tests all the methods created in the class
        char[] test = {
            'S', 'h', 'a', 'k', 'e', ' ', 'I', 't', ' ', 'O', 'f', 'f',' ', 'b', 'y', ' ','T', 'S',  '\0'
        };
        Mystring tester = new Mystring(test);
        System.out.println("The char array in the object is '" + tester.getMyString() + "'");
        int a = tester.length();
        int b = 4;
        System.out.println("The string version of the oject is " + tester.toString());
        System.out.println("The value stored at " + b + " is " + tester.charAt(b));
        System.out.println("The length of the object array is " + a);
        Mystring upper = tester.toUpperCase();
        System.out.println("The uppercase version is " + upper);
        Mystring lower = tester.toLowerCase();
        System.out.println("The lowercase version is " + lower);
        Mystring new1 = tester.substring(0, 6);
        System.out.println("The substring of " + tester + " is " + new1);
        lower.equals(lower);
        Mystring val = tester.valueOf(3);
        System.out.println(" The value of " + 3 + " is: " + val);
        		
        
        
    }
    
    
}

