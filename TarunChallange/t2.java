package TarunChallange;

import java.util.Scanner;

public class t2 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int[] arr = new int[size];

    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    //print array
    for (int i = 0; i < size; i++) {
      System.out.println(arr[i]);
    }

    int target = sc.nextInt();

    //finding targets index
    for (int i = 0; i < size; i++) {
      if (arr[i] == target) {
        System.out.println("The indexOf " + target + " in array is " + i);
        break;
      } else {
        System.out.println("target does not exist in the given array");
      }
    }
  }
}
