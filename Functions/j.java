import java.util.*;
// public class j {
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name); // call function
//     }
// }

// Q. Make a fnc and return sum

// public class j {
//     public static int sum(int n1,int n2){
//         int sum = n1+n2;
//         System.out.println("sum of two numbers is " + sum);
//         return sum;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();
//         sum(n1, n2);
//     }
// }

// Q . Make a fnc to return product of it.
// public class j {
//     public static int product(int n1,int n2){
//         return n1*n2;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();
//         // product(n1, n2);
//         System.out.println("The Product of "+n1 +" & "+ n2 + " is "  + product(n1, n2));

//     }
// }

// Q .Find the factorial of a number

public class j {
    public static int sum(int n1) {
        int prevNum = 1;

        for (int i = n1; i >= 1; i--) {
            prevNum = prevNum * i;

        }
        System.out.println(prevNum);
        return prevNum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        sum(n1);
    }
}