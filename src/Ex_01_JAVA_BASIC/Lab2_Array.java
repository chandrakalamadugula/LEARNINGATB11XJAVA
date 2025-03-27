package Ex_01_JAVA_BASIC;

public class Lab2_Array {
public static void  main(String[] args){
    int[] marks= {25,14,56,15,39,36,56,77,18,29,49};
    System.out.println("Array Length is " +marks.length);
    //Program to find maximum value of an array
    int m=marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > m)
                m = marks[i];
        }
        System.out.println("max value of array is " +m);

}
}
