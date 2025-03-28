package Ex_01_JAVA_BASIC;

public class Lab27_2DArray {
    public static void main(String[] args){

       //int a[]={1,2,3};
        //int a[]={4,5,6};
        //int a[]={7,8,9};
// instead of creating three different arrays we can create a 2D array
        //R-> 3
        //C -> 3
    int[][] array_2d = new int[3][3];
    array_2d[0][0] = 1;
    array_2d[0][1]=2;
    array_2d[0][2]=3;

    array_2d[1][0] = 4;
    array_2d[1][1]=5;
    array_2d[1][2]=6;

    array_2d[2][0] = 7;
    array_2d[2][1]=8;
    array_2d[2][2]=9;
        //alternate way to declare array
        //int[][] array_2D = {{1,2,3},{4,5,6}{7,8,9}};
       int[][] array_twoD = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

    for(int i=0;i<3;i++) {
        for (int j = 0; j < 3; j++)
            System.out.print("" + array_2d[i][j] + " ");
        System.out.println("\n");

    }

        System.out.println("The array_twoD is\n");
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++)
                System.out.print("" + array_twoD[i][j] + " ");
            System.out.println("\n");
        }

}
}
