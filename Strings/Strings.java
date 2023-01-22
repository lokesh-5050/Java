package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Strings {
    //Q1.Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int totlength= 0 ;
        String arr[] = new String[size];

        for(int i = 0 ; i<size ; i++){
            arr[i] = sc.next();
            totlength+= arr[i].length();
        }

        // System.out.println(Arrays.toString(arr).length());
        for(int i = 0 ; i<size ; i++){
            System.out.print(arr[i]);
        }

        System.out.println(totlength);
    }
}
