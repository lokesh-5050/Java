package Strings;

import java.util.Scanner;

public class replaceLetter {

  //Q2. Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
  // Example :
  // original = “eabcdef’ ; result = “iabcdif”
  // Original = “xyz” ; result = “xyz”

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String orignal = sc.next();
    String replaceWith = "i"; 
    String result = "";
    System.out.println("the input string is "+orignal);

    for(int i = 0 ; i<orignal.length() ; i++){

        if(orignal.charAt(i) == 'e'){
            result += 'i';
        }else{
            result += orignal.charAt(i);
        }
                
    }

    System.out.println(result);

  }
}
