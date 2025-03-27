package Ex_01_JAVA_BASIC;

public class Lab26_ArrayEvenOdd {
    public static void main(String[] args) {
        int numbers[] = {5, 4, 3, 35, 56, 87, 34, 57, 88, 44, 33, 66, 34, 32, 78, 59};
        int i = 0;
        System.out.println("The even numbers are");
        for (i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                System.out.printf(" " + numbers[i]);
            }
        }
        System.out.println("\nThe odd numbers are");
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 !=0) {
                System.out.printf(" " + numbers[i]);
            }
        }
    }
}