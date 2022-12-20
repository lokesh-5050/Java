
// <!-- https://docs.google.com/document/d/1eEv8JMCr_ZBoE5JSsZxdT5Zq53vq388-EIbE_mi7QME/edit -->
import java.util.*;

// // <!-- Q.1 Enter 3 numbers from the user & make a function to print their average. -->
// public class exercise {
//     public static int calcAverage(int i1, int i2, int i3) {
//         int sum = i1 + i2 + i3;
//         int avg = sum/2;
//         return avg;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int i1 = sc.nextInt();
//         int i2 = sc.nextInt();
//         int i3 = sc.nextInt();
//         System.out.println("The average of " + i1 + " " + i2 + " " + i3 + " " + " is " + calcAverage(i1, i2, i3));
//     }
// }

// // Q .2 Write a function to print the sum of all odd numbers from 1 to n.
// public class exercise {
//     public static void oddNum(int inp){
//         for(int i = 1 ; i<=inp ; i++){
//             if(i%2 != 0){
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int inp = sc.nextInt();
//         oddNum(inp);
//     }
// }

// // Q.3 Write a function which takes in 2 numbers and returns the greater of those two.
//  public class exercise {
//         public static void whichIsGreator(int i1 , int i2){
//             if(i1>i2){
//                 System.out.println(i1);
//             }else{
//                 System.out.println(i2);
//             }
//         }
//         public static void main(String args[]) {
//             Scanner sc = new Scanner(System.in);
//             int i1 = sc.nextInt();
//             int i2 = sc.nextInt();
//             whichIsGreator(i1,i2);
//         }
//     }

// // Q.4 Write a function that takes in the radius as input and returns the circumference of a circle.
// public class exercise {
//     public static void circumferenceOfCir(int r1) {
//         double pi = 3.141592653589793238;
//         double circumference = 2 * pi * r1;
//         System.out.println(circumference);
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int r1 = sc.nextInt();
//         circumferenceOfCir(r1);
//     }
// }

// Q.5 Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

// public class exercise {
//     public static void isElegible(int age){
//         if(age>18){
//             System.out.println("Eligible");
//             return;
//         };
//         System.out.println("Not Eligable");
//         return;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         isElegible(age);
//     }
// }

// Q.6  Write an infinite loop using do while condition.
// public class exercise {
//     public static void infiniteLoop(int i) {
//         do {
//             System.out.println("Hello");
//         } while (i != 0);
//     }

//     public static void main(String args[]) {
//         // // Scanner sc = new Scanner(System.in);
//         // // int i = sc.nextInt();
//         // int i =1;
//         infiniteLoop(i);

//     }
// }

// Q.7 Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
// public class exercise {

//     public static void main(String args[]) {
//         System.out.println("enter 1 to start ");
//         int positive = 0 , negative = 0, zeros = 0;
//         Scanner sc = new Scanner(System.in);
//         int more = sc.nextInt();

//         while (more == 1) {
//             System.out.println("Enter numbers");
//             int number = sc.nextInt();
//             if(number>0){
//                 positive++;

//             }else if(number<0){
//                 negative++;

//             }else{
//                 zeros++;
//                 System.out.println("positive =>" +  positive);
//                 System.out.println("negative =>" +  negative);
//                 System.out.println("zeros =>" +  zeros);
//             }

//         }

//     }
// }

// Q.8 Two numbers are entered by the user, x and n. Write a function to find the value 
// of one number raised to the power of another i.e. xn.
// public class exercise {
//     public static double calPowerValues(int x,int n){
//          if(n==0){
//             return 1;
//          }else{
//             return Math.pow(x, n);
//          }

//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int n = sc.nextInt();

//         // calPowerValues(x,n);
//         System.out.println("The "+ x + " "+ " to " + n + " is " + " => " + calPowerValues(x, n));
//     }
// }

// Q.9 Write a function that calculates the Greatest Common Divisor of 2 numbers. 
// public class exercise {
//     public static int gcd(int a , int b){
//         int smallestNum;
//         if(a<b){
//             smallestNum = a;
//         }else{
//             smallestNum = b;
//         }

//         //takig a for loop starts form smallest iterartion
//         for(int i = smallestNum ; i>1 ; i--){
//             if(a%i == 0 && b%i ==0){
//                 return i;
//             }
//         }
//         return 1;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("Gcd of "+a +" "+ b + " " + " is => "+ gcd(a, b));
//     }
// }

// Q.10 Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

public class exercise {
    public static void fibonacci(int n){
        int n1 =0 , n2 =1 , next_num;
        for(int i = 1; i<=n ;i++){
            System.out.println(n1);
            next_num = n1+n2;
            //swapping 
            n1=n2;
            n2=next_num;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }
}