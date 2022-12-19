
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