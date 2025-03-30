package Ex_01_JAVA_BASIC;

import java.util.Scanner;

public class Lab33_ArrayPattern {
    public static void main(String[] args){
        //pattern needed
        //***
        //**
        //*
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int n= scanner.nextInt();
        for (int i=0;i<=n;i++){
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.print("\n");
        }


    }
}
