package Ex_01_JAVA_BASIC;

import java.util.Arrays;

public class Lab024_ArraysSort {
    public static void main(String[] args) {

        int i, j, t;
        int price[] = {250, 300, 898, 546, 367, 876, 564, 323, 132, 456};
        for (j = 0; j < price.length - 1; j++) {
            for (i = j + 1; i <= price.length - 1; i++) {
                if (price[j] < price[i]) {
                    t = price[i];
                    price[i] = price[j];
                    price[j] = t;
                }
            }
        }

        for (i = 0; i < price.length; i++)
            System.out.println(price[i]);
    }
}
