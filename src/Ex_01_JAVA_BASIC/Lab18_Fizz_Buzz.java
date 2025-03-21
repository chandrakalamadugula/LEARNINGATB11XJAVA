package Ex_01_JAVA_BASIC;

public class Lab18_Fizz_Buzz{
    public static void main(String[] args){

        for( int i=0; i<=100; i++){
            if (i % 15 == 0)
                System.out.println(i+ "-->FizzBuzz");
            else if (i%5==0)
                System.out.println(i+ "-->Buzz");
            else if (i%3==0)
                System.out.println(i+ "-->Fizz");
            else System.out.println(i);
        }

    }



}
