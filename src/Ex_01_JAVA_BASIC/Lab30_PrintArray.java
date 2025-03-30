package Ex_01_JAVA_BASIC;

public class Lab30_PrintArray {
    public static void main(String[] args){

        int[][] Matrix2D = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<Matrix2D.length;i++) {
            for (int j = 0; j < Matrix2D[i].length; j++)
                System.out.print(" " +Matrix2D[i][j]);
            System.out.print('\n');

        }
    }
}
