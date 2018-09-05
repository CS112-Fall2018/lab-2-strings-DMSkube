/**
* The StringFun program takes 3 strings as input and performs 9 String methods to them, printing out the results.
*     In addition to the required 7 methods, I added the methods 's.join' and 's.toUpperCase'. The former concatenates multiple strings
*     together with a speficied connector, and the latter converts all letters of a chosen string to the uppercase.
* @author Daniel Skube
* @version 1.0
* @since 9/4/18
*/

import java.util.Scanner; // Import package for Scanner function

public class StringFun {
    public static void main(String[] args) {
      // Gather User Input
      Scanner scanner = new Scanner(System.in); //Create scanner object for taking input
      System.out.println("String \"s\" = "); // Tells User What to Input
      String s = scanner.nextLine(); // Input Box
      System.out.println(""); // Aesthetic Spacing
      
      System.out.println("String \"otherString\" = ");
      String otherString = scanner.nextLine();
      System.out.println("");
      
      System.out.println("String \"subString\" = ");
      String subString = scanner.nextLine();
      System.out.println("");

      // Print User Results
      System.out.println("1. Length of \"s\" = " + s.length());                                                     // Length of String 's'
      System.out.println("2. Is \"s\" equal to \"otherString\"? " + s.equals(otherString));                         // Does 's' = 'subString'?
      System.out.println("3. Index 0 - 2 of \"s\" = " + s.substring(0, 2));                                         // Text of 's' index:0 to index:2
      System.out.println("4. \"s\" trimmed of whitespaces = " + s.trim());                                          // Trim 's' of Whitespace
      System.out.println("5. First index of the Letter \"e\" in \"s\": " + s.indexOf('e'));                         // First index of 'e' in 's'
      System.out.println("6. Last index of the Letter \"e\" in \"s\" = " + s.lastIndexOf('e'));                     // Last index of 'e' in 's'
      System.out.println("7. Character at index:1 of \"s\" = " + s.charAt(1));                                      // What character is at index:1 of 's'?
      System.out.println("8. \"subString\" joined to \"otherString\" = "+ String.join("", subString, otherString)); // Join 'subString' to 'otherString'
      System.out.println("9. \"s\" in all capital letters: " + s.toUpperCase());                                    // Convert 's' to all uppercase letters

      System.out.println(""); // Aesthetic Spacing


    }
}