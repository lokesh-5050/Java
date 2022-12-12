// public class lec2 {
//     public static void main(String[] args) {
//         System.out.println("Hello World");

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
// import java.util.*;

// public class lec2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int input = sc.nextInt();
//         System.out.println("");
//         System.out.println(input * 1);
//         System.out.println(input * 2);
//         System.out.println(input * 3);
//         System.out.println(input * 4);
//         System.out.println(input * 5);
//         System.out.println(input * 6);
//         System.out.println(input * 7);
//         System.out.println(input * 8);
//         System.out.println(input * 9);
//         System.out.println(input * 10);

//     }
// }

// ***********************************
//IF ELSE STATEMENTS FROM HERE

//Q1. firstly lets understand if else on odd and even cases

//so im gonna take a number as a input

// import java.util.*;
// public class lec2 {
//     public static void main(String[] args) {
//         //input
//         Scanner sc = new Scanner(System.in);
//         int input = sc.nextInt();
//         if(input%2 == 0){
//             System.out.println(input + " is even");
//         }else{
//             System.out.println(input + " is odd");
//         }
//     }
// }

// Q2. take two input from user and check
//whether a == b then print equal , if a > b then print a is greator and same less

// import java.util.*;

// public class lec2{
//     public static void main(String[] args) {
//         //taking two inputs from user
//         Scanner sc = new Scanner(System.in);
//         Scanner sb = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if(a==b){
//             System.out.println("Both numbers are Equal");
//         }else if(a > b){
//             System.out.println("a is greator than b");
//         }else if(a < b){
//             System.out.println("b is greator than a");
//         }

//     }
// }

// ***************************************
// SWITCH STATEMENT JAVA

// Q3. if 1 so print hello , 2 then namaste then 3 is Bonjor
// import java.util.*;

// public class lec2{
//     public static void main(String[] args) {
//         //taking two inputs from user
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         // if(a == 1){
//         //     System.out.println("Hello");
//         // }else if(a == 2){
//         //     System.out.println("Namaste");
//         // }else if(a == 3){
//         //     System.out.println("Bonjor");
//         // }else{
//         //     System.out.println("Only 1,2 & 3 are allowed");
//         // }

//         switch(a){
//             case 1 : System.out.println("Hello");
//             break;
//             case 2 : System.out.println("Namaste");
//             break;
//             case 3 : System.out.println("Bonjour");
//             break;
//             default: System.out.println("Invalid input");
//         }

//     }
// }

// Q4. Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

// import java.util.*;

// public class lec2{
//     public static void main(String[] args) {
//         //taking two inputs from user
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int op = sc.nextInt();
//         switch(op){
//             case 1 : System.out.println("Sum of a & b is " + (a + b));
//             break;
//             case 2 : System.out.println("Subtraction of a & b is " + (a - b));
//             break;
//             case 3 : System.out.println("Product of a & b is " + (a*b));
//             break;
//             case 4 : System.out.println("Modulo of a & b is " + (a%b));
//             break;
//         }

//     }
// }

// Q5. Ask the user to enter the number of the month & print the name of the month.
//  For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

// import java.util.*;

// public class lec2 {
//     public static void main(String[] args) {
//         //take int from user
//         Scanner sc = new Scanner(System.in);
//         int monthNo = sc.nextInt();
//         switch(monthNo){
//             case 1 : System.out.println("January");
//             break;
//             case 2 : System.out.println("Feburary");
//             break;
//             case 3 : System.out.println("March");
//             break;
//             case 4 : System.out.println("April");
//             break;
//             case 5 : System.out.println("May");
//             break;
//             case 6 : System.out.println("June");
//             break;
//             case 7 : System.out.println("July");
//             break;
//             case 8 : System.out.println("August");
//             break;
//             case 9 : System.out.println("September");
//             break;
//             case 10 : System.out.println("October");
//             break;
//             case 11: System.out.println("November");
//             break;
//             case 12 : System.out.println("December");
//             break;
//             default : System.out.println("There are only 12 months in a year !!!");
//         }
//         }
// }

// ************************
// lec - 4 
// Now learning about java Loops
// for loop , while loop , do-while loop

// first for loop

// public class lec2{
//     public static void main(String args[]) {
//         // for(int i = 0 ; i < 5 ; i++){
//         //     System.out.println("Hello world");
//         // }

//     }
// }

// // Q1. print 0 to 10
// public class lec2 {
//     public static void main(String args[]) {
//         for(int i = 0 ; i < 11 ; i++){
//             System.out.println(i);
//         }
//     }
// }

// // Q2. print 24 to 67
// public class lec2 {
//     public static void main(String args[]) {
//         for(int i = 24 ; i < 68  ; i++){
//             System.out.println(i);
//         }
//     }
// }

//******************************* 
// Now while loop

// public class lec2{
//     public static void main(String args[]) {
//         int i = 0;
//         while(i<5){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// *******************
// Now do-while loop
// in this atleast one time will be done

// public class lec2 {
//     public static void main(String args[]){
//         int i = 0;
//         do{
//             System.out.println(i);
//             i++;
//         }while(i < 0);
//     }
// }

// Demontrating the while and do-while loops by giving them a false condition
// public class lec2 {
//         public static void main(String args[]){
//             int i = 12;
//             while(i < 11){
//                 System.out.println(i+ "By while");
//             }
//             //in while loop nothing will be printed

//             do{
//                 System.out.println(i + "By do-while");
//             }while(i < 11);
//             //do-while will print the false condition one time

//     }
// }

// Qs on loops

// Q1. Print the sum of first n Natural numbers
// import java.util.*;
// public class lec2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i = 1 ; i < n+1 ; i++){
//             sum += i;
//         }
//         System.out.println(sum);
//     }
// }

// Q2. Print the table of a number input by the user

// import java.util.*;
// public class lec2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int input = sc.nextInt();
//         int times = 0;
//         for(int i = 1 ; i <= 10 ; i++){
//             times = input * i;
//             System.out.println(times);
//         }

//     }
// }

// Q3. Print all even numbers till n.
// import java.util.*;
// public class lec2 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int inp = sc.nextInt();
//         for(int i = 1 ; i <= inp ; i++){
//             if(i%2 == 0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

// public class lec2 {
//     public static void main(String args[]) {
//         for (;;) {
//             System.out.println("Apna College");
//         }

//     }
// }

// Q4. Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.

// import java.util.*;

// public class lec2 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int inp = sc.nextInt();

//         if (inp == 1) {
//             while (inp != 0) {
//                 Scanner sb = new Scanner(System.in);
//                 int inp2 = sb.nextInt();
//                 int tot = 0;
//                 for(int i = )

//                 System.out.println(tot +  " total marks!");
//                 if (inp2 == 0) {
//                     System.out.println(  " marks scored");
//                     break;
//                 }

//             }
//         }else if(inp == 0){
//             System.out.println("Exit Successfully");
//         }else {
//             System.out.println("Only 0 & 1 inputs are allowed");
//         }

//     }
// }

// import java.util.*;

// public class lec2 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int inp1 = sc.nextInt();

//         if(inp1 == 1){
//             int tot = 0;
//             while (inp1 != 0) {
//                 Scanner sb = new Scanner(System.in);
//                 int inp2 = sb.nextInt();

//                 tot += inp2;

//                 if(inp2 == 0){

//                     if(tot >= 90){
//                         System.out.println("This is Excellent " + tot);
//                     }else if(tot >= 70){
//                         System.out.println("This is good " + tot);
//                     }else if(tot >= 50){
//                         System.out.println("nice " + tot);
//                     }else if(tot >= 30){
//                         System.out.println("Can do better! " + tot);
//                     }else if(tot >= 10){
//                         System.out.println("Wow!!! pdh le bc " + tot);
//                     }
//                     System.out.println("total score" + tot);
//                 }

//             }
//         }
//     }
// }

//solving the same question with do-while loop

// import java.util.*;

// public class lec2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int inp1 = sc.nextInt();
//         int tot = 0;
//         do {
//             System.out.println("Enter the marks");
//             Scanner sb = new Scanner(System.in);
//             int inp2 = sb.nextInt();

//             tot += inp2;
//             if(inp2 == 0){
//                 if(tot > 90){
//                     System.out.println("Excellent"+ tot);
//                 }else if(tot > 70){
//                     System.out.println("Good"+ tot);
//                 }else if(tot > 50){
//                     System.out.println("Nice"+ tot);
//                 }else if(tot > 30){
//                     System.out.println("can do better"+ tot);
//                 }else if(tot > 20){
//                     System.out.println("Padh le bhai!!!"+ tot);
//                 }else if(tot < 10){
//                     System.out.println("Failed the test"+ tot);
//                 }
//             }

//         } while (inp1 == 1);
//         if(inp1 == 0){
//             System.out.println("Successfully exited the program!");
//         }

//     }
// }

// Q5. Print if a number is prime or not (Input n from the user).

// import java.util.*;
// public class lec2 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         if(n%n == 0){
//             System.out.println(n + " is a prime number");
//         }else{
//             System.out.println(n + " is a not prime number");

//         }
//     }
// }

// Q4. {REPEAT} Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.

// import java.util.*;

// public class lec2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int inp1 = sc.nextInt();

//         int tot = 0;
//         do {
//             System.out.println("Enter marks");
//             Scanner sb = new Scanner(System.in);
//             int inSide = sb.nextInt();
//             tot += inSide;

//             if(inSide == 0){
//                 if(tot >90){
//                     System.out.println("Excellent "  + tot );
//                 }else if(tot > 70){
//                     System.out.println("Awesome " + tot);
//                 }else if(tot >50){
//                     System.out.println("Good " + tot);
//                 }else if(tot >30){
//                     System.out.println("Nice " + tot);
//                 }else if(tot >=0){
//                     System.out.println("Can do better " + tot);
//                 }
//                 System.out.println("Successfully exited the program");
//                 break;
//             }
//         } while (inp1 == 1);
//     }
// }

// @@@@@@@@@@@@@@@@@@@@@@@@
// Pattern Questions
// Q1. *****
// *****
// *****
// *****
// public class lec2{
//     public static void main(String args[]){
//         int row = 5;
//         int column = 4;
//         //oute loop
//         for (int i = 1; i <= column; i++) {
//             //inneer loop
//             for (int j = 1; j <= row; j++) {
//                 System.out.print("*");
//             }
//             System.out.println("*");
//         }

//     }
// }

/* Q2. *****
 *     *   *
 *     *   *
 *     *****       
 */

//  public class lec2{
//     public static void main(String args[]){
//         int row = 5;
//         int column = 4;

//         //outer loop
//         for (int i = 1; i <= column; i++) {
//             //inner loop
//             for (int j = 1; j <= row; j++) {
//                 if(j == 2){
//                     System.out.print("*"+" "+" "+" "+"*");
//                     // System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }

//     }
//  }

// Q. Revsion

// to print 

// *****
// *****
// *****
// *****

// public class lec2{
//     public static void main(String args[]) {
//         for(int i= 1 ; i<=4 ; i++){
//             for(int j = 1 ; j<=5 ; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

// Q2. 

// *****
// *   *
// *   *
// *****

// public class lec2{
//     public static void main(String args[]){
//         int r =4;
//         int c =5;
//         for(int i =1 ; i<=4 ; i++){
//             for(int j =1 ; j<=5 ; j++){
//                 if(i==1 || j==c || i==r || j==1){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     }
// }

// Q3.

// *
// **
// ***
// ****

// public class lec2{
//     public static void main(String args[]) {
//         int r =4;
//         for(int i =1 ; i<=r ; i++){
//             for(int j = 1 ; j<=i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Q4.

// ****
// ***
// **
// *

// public class lec2{
//     public static void main(String args[]) {
//         int r= 4;
//         for(int i=r ; i>=1 ; i--){
//             for(int j=1 ; j<=i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         }
//     }

// Q5.

//     *
//    **    
//   ***
//  ****

// public class lec2{
//         public static void main(String args[]) {
//             int r =4; 

//            for(int i = 1 ; i<=r ; i++){
//             //inner Loop => space print
//             for(int j =1 ; j<=r-i ; j++){
//                 System.out.print(" ");
//             }

//             //inner Loop => star print 
//             for(int j =1 ; j<= i  ; j++){
//                 System.out.print("*");
//             }

//             System.out.println();

//            }
//         }
//     }

// Q6. 

// 1
// 12
// 123
// 1234
// 12345

// public class lec2 {
//     public static void main(String args[]) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for(int j=1;j<=i ; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// Q.8 -floyd-triangle
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// public class lec2 {
//     public static void main(String args[]) {
//         int n = 5;
//         int number = 1;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(number);
//                 number++;
//             }
//             System.out.println();

//         }
//     }
// }

// Q. 0-1 triangle
// 1
// 01
// 101
// 0101
// 10101

public class lec2 {
    public static void main(String args[]) {
        int n = 5;
        // int number = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print(1);
                    
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }
}