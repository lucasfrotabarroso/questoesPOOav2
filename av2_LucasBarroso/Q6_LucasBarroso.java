package av2_LucasBarroso;

import java.util.Random;

public class Q6_LucasBarroso {
   public static void main(String[] args) {
      int N = 3;
      int M = 4;
      int P = 2;
      
      
      int[][] a = initMatrix(N, M);
      int[][] b = initMatrix(M, P);
      int[][] c = new int[N][P];
      
      
      for (int i = 0; i < N; i++) {
         for (int j = 0; j < P; j++) {
            for (int k = 0; k < M; k++) {
               c[i][j] += a[i][k] * b[k][j];
            }
         }
      }
      
   
      for (int i = 0; i < N; i++) {
         for (int j = 0; j < P; j++) {
            System.out.print(c[i][j] + " ");
         }
         System.out.println();
      }
   }
   
   
   private static int[][] initMatrix(int rows, int cols) {
      Random rand = new Random();
      int[][] matrix = new int[rows][cols];
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            matrix[i][j] = rand.nextInt(10);
         }
      }
      return matrix;
   }
}

