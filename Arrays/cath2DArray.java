import java.util.*;

public class cath2DArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //print matrix
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println(" ");
        }

        int x = 8; 
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                if(matrix[i][j] == x){
                    System.out.println("The "+x+" lies at "+" row "+i+" and cols "+j);
                }
            }
        }
        
    }
}