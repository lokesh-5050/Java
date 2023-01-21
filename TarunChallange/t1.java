package TarunChallange;

import java.util.*;

public class t1 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();

    int[][] number = new int[r][c];

    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        number[i][j] = sc.nextInt();
      }
    }
    // 1 2 3 4
    // 5 6 7 8
    // 9 8 4 2
    // 8 2 5 3

    int rs = 0, re = r - 1;
    int cs = 0, ce = c - 1;
    while(cs<ce){
      //1st loop
      for (int i = rs; i <= re; i++) {
        System.out.print(number[i][cs] + " ");
      }
      cs++;

      //2nd loop
      for (int i = re; i >= rs; i--) {
        System.out.print(number[i][cs] + " ");
      }
      cs++;
      //3rd loop
      for (int i = rs; i <= re; i++) {
        System.out.print(number[i][cs] + " ");
      }
      cs++;
      //4th loop
      for (int i = re; i >= rs; i--) {
        System.out.print(number[i][cs] + " ");
      }
      c++;
    }
    
  }
}
