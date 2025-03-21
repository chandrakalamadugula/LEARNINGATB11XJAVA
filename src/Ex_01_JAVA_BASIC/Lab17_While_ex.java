package Ex_01_JAVA_BASIC;

public class Lab17_While_ex {
    public static void main(String[] args) {
        int a = 0;
        while (a < 0) {
            System.out.println(a);
            a++;
        }

        do {
            System.out.println(a);
            a++;
        } while (a < 0);
    }
}