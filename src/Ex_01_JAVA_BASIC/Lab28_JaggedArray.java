package Ex_01_JAVA_BASIC;

public class Lab28_JaggedArray {

    //java allows jagged arrays where each row can have a different length , i.e different number of columns

    public static void main(String[] args) {
        int[][] jag_Array = { {1,2,3},{4,5,6,7},{7}};
        for (int i = 0; i < jag_Array.length; i++) {      //jag_array.length gives the length of the array i.e how many rows
            for (int j = 0; j < jag_Array[i].length; j++) //jag_array[i].length gives the length of the i th row  i.e how many columns it has
                System.out.print("" + jag_Array[i][j] + " ");
            System.out.println("\n");

        }
    }
}
