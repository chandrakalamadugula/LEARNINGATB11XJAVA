package Ex_01_JAVA_BASIC;

public class Lab015_FibonacciSequence {
    public static void main(String[] args){
        int n=1,i=0,b=1;
        System.out.println(i);
        System.out.println(n);
        for (i=0;i>=0;i++)
        {
            System.out.println(b);
            i=n;
            n=b;
            b=n+i;

        }

    }
}
