// method 1 to declare an array
// int marks[] = new int[size];

// method 2
// int arrayName[] = {a,b,c};

package Arrays;

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
import java.util.*;

public class a1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[] = new int[size];

        // lets say i have to find the index at which number 22 is there.
        // //input
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Arrays values is not initialized");

        // output
        for (int i = 0; i < size; i++) {
            System.out.println(marks[i]);
        }

        // now finding that index at which 22 is there.
        for (int i = 0; i < size; i++) {
            if (marks[i] == 22) {
                System.out.println("The 22 is at index=> " + i);
                return;
            }
        }

    }

}
