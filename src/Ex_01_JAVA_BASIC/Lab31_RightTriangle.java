package Ex_01_JAVA_BASIC;

import javax.swing.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class Lab31_RightTriangle {
    public static void main(String[] args){

   int[][] mat = { {1,0,0} , {1,2,0} , {4,5,6} };

        for  (int i=0;i<mat.length;i++)
            for(int j=0;j>i;j++) {
                if (mat[i][j] != 0) {
                    System.out.println("not a Right Side matrix");
                    exit(0);
                }
            }

        for  (int i=0;i<mat.length;i++)
            for (int j = 0; j <= i; j++) {
                if (mat[i][j] == 0) {
                    System.out.println("not a Right Side matrix");
                    exit(0);
                }


        }
        System.out.println("This is a right side matrix");
            }



    }

