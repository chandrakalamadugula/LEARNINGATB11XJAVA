package Ex_01_JAVA_BASIC;

import java.util.Arrays;

public class Lab22_Arrays {
    public static void main(String[] args){ //find the second highest number
        int numbers[]={23,24,45,56,54,43,76};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);

    }

}
