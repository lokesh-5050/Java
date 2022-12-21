// method 1 to declare an array
// int marks[] = new int[size];

// method 2
// int arrayName[] = {a,b,c};

// package Arrays;

// import java.util.Scanner;

// public class a1{
//     public static void main(String args[]) {
//         // int[] marks = new int[3];
//         int marks[] = new int[3];
//         marks[0] = 77777;
//         marks[1] = 20;
//         marks[2] = 30;
//         System.out.println("marks[0] " + marks[0]);
//         System.out.println("marks[1] " + marks[1]);
//         System.out.println("marks[2] " + marks[2]);
//         // System.out.println(marks);
//         for(int i = 0 ; i<marks.length ;i++ ){
//             System.out.println(marks[i]);
//         }
//     }
// }

// Taking inputs from the user and defining the array's size and setting values through a loop;
// import java.util.*;

// public class a1 {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int marks[] = new int[size];

//         // lets say i have to find the index at which number 22 is there.
//         // //input
//         for (int i = 0; i < size; i++) {
//             marks[i] = sc.nextInt();
//         }

//         System.out.println("Arrays values is not initialized");

//         // output
//         for (int i = 0; i < size; i++) {
//             System.out.println(marks[i]);
//         }

//         // now finding that index at which 22 is there.
//         for (int i = 0; i < size; i++) {
//             if (marks[i] == 22) {
//                 System.out.println("The 22 is at index=> " + i);
//                 return;
//             }
//         }

//     }

// }


// import java.util.*;

// public class a1 {
//     public static void fibo(int n){
//         int n1=0 , n2=1 , next_num;

//         for(int i = 1 ; i<=n ; i++){
//             System.out.println(n1);  // 0 1 1 2 3 5

//             next_num = n1+n2;
//             n1=n2;
//             n2=next_num;
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         fibo(n);
        
//     }
// }

// Q1. Take an array of names as input from the user and print them on the screen.
import java.util.*;

// public class a1 {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String name[] = new String[size];

//         //inputing inputs
//         for(int i = 0 ; i<name.length ; i++){
//             name[i] = sc.next();
//         }

//         for(int i = 0 ; i<name.length ; i++){
//             System.out.println( i+ " "+name[i]);
//         }

//         System.out.println();
//     }
// }

// Q2. Find the maximum & minimum number in an array of integers

// public class a1 {

//     public static void main(String args[]) {
//         int numbers[] = {1,2,34,5,6,88,23,34}; 

//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;

//         for(int i = 0 ; i<numbers.length ; i++){
//             if(numbers[i] < min){
//                 min = numbers[i];
//             }
//             if(numbers[i] > max){
//                 max = numbers[i];
//             }
//         }
  
//         System.out.println("max no is "+max);
//         System.out.println("min no is "+min);
//     }
// }


// Q.2 Take an array of numbers as input and check if it is an array sorted in ascending order.

public class a1 {

    public static void reverse(int[] nums){
        int n = nums.length;

        for(int i =0 ; i<n/2 ; i++){
            //storing first half temporaary
            int temp = nums[i];

            //assigning fist half to the second half
            nums[i] = nums[n-i-1];

            //assigning second half to the first half
            nums[n-i-1] = temp;
        }

        //printing all the values
        for(int i =0 ; i<n ; i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String args[]) {
        int nums[] = {4,84,2131,54,21,58,24,99,34,90};
        reverse(nums);

    }
}