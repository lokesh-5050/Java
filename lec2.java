// public class lec2 {
//     public static void main(String[] args) {
//         System.out.println("Hello world");
//         // System.out.print("Hello world\n");
//         // System.out.print("Hello world");
//     }
// }

// Q1. print the pattern
// * 
// **
// ***
// ****
// public class lec2 {
//     public static void main(String[] args) {
//         System.out.print("*\n");
//         System.out.print("**\n");
//         System.out.print("***\n");
//         System.out.print("****");
//     }
// }

//variables

// public class lec2 {
//     public static void main(String[] args) {
//         String name = "Lokesh";
//         int age = 19;
//         double price = 38.6;
//         int a = 18;
//         int b = 19;

//         b = 20;
//         name = "Yash";


//     }
// }

//DATA TYPES
// PRIMITIVE DATA TYPES
// 1 byte
// 2 short
// 3 char - 2 bytes
// 4 boolean - 1 byte
// 5 int - 4 bytes
// 6 long - 8 bytes
// 7 float - 4 bytes
// 8 double - 8 bytes


// NON-PRIMITIVE DATA TYPES
// 1 String
// 2 Array
// 3 Class
// 4 Object
// 5 Interface


// public class lec2 {
//     public static void main(String[] args) {
//         //variables
//         int a = 10;
//         int b = 20;
//         int c = a+b;
//         int d = b-a;
//         int mul = a*b;
//         // System.out.println(c);
//         // System.out.println(d);
//         System.out.println(mul);
//     }
// }

// Q2. Priority in java Simple Questions
// NO BADMAS IN JAVA
//    * >> / >> % >> -+

// => a * b / a- b 
// i.e a = 10 , b = 5

// solve
// 50/10-5
// answer => 0 ;


//INPUTS FROM USER
// import java.util.*;

// public class lec2 {
//     public static void main(String[] args) {
//         //input
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine(); //nextLine() to print the whole line
//         //  sc.nextInt(); //nextLine() to print the whole line
//         //  sc.nextFloat(); //nextLine() to print the whole line
//         //  sc.nextLong(); //nextLine() to print the whole line

//         System.out.println(name);
        
//     }
// }


//QUESTION of whole lec 2
// Q1.  Take 2 varibales 'a' & 'b' and print their sum.
// import java.util.*;
// public class lec2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Scanner sb = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sb.nextInt();
//         int c = a+b;
//         System.out.println(c);

//     }
// }

// Q2.Make a program that takes the radius of a circle as input,
//  calculates its radius and area and prints it as output to the user.
// import java.util.*;
// public class lec2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double radius = sc.nextFloat();
//         double radiusSq = radius * radius;
//         double pi = 3.14;
//         double area = pi * radiusSq;
//         System.out.println(area);
//     }
// }



// Q3. Make a program that prints the table of a number that is input by the user. 
import java.util.*;


public class lec2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("");
        System.out.println(input * 1);
        System.out.println(input * 2);
        System.out.println(input * 3);
        System.out.println(input * 4);
        System.out.println(input * 5);
        System.out.println(input * 6);
        System.out.println(input * 7);
        System.out.println(input * 8);
        System.out.println(input * 9);
        System.out.println(input * 10);

    }
}