/* Use methods to:

1. Get a String from the user at the command line
2. Populate an ArrayList of Character data (the wrapper class), with each char 
in the String represented as a separate Character element in the ArrayList
3. Output each Character to the command line, each on a separate line
 */
package stringslicer;

import java.util.Scanner;
import java.util.ArrayList;

public class StringSlicer{

   public static void main(String[] args){
       
       String stringInput = UserString();
       ArrayList characterArrayList = makeArrayList(stringInput);
       printArrayList(characterArrayList);
   }

public static String UserString(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter string: ");
    String s = input.nextLine();
    return s;
}

public static ArrayList makeArrayList(String userString){
    ArrayList arr = new ArrayList();
    for(int i=0; i<userString.length(); i++){
        arr.add(userString.charAt(i));
    }    
    return arr;
}

public static void printArrayList(ArrayList listOfCharacters){
   for(int i=0; i<listOfCharacters.size(); i++){
       System.out.println(listOfCharacters.get(i));
   }
}
}