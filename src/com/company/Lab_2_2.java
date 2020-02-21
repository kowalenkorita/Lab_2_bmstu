package com.company;
import java.util.Scanner;

//Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.

public class Lab_2_2 {

    public static void main(String[] args) {
//      ввод размеров матрицы
        System.out.println("Enter n:");
        int width = new Scanner(System.in).nextInt();
        System.out.println("Enter hight:");
        int hight = new Scanner(System.in).nextInt();
        sumElement(matrixInput(width, hight));
    }

    public static int[][] matrixInput(int width, int hight) {
        int[][] array = new int[hight][width];
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] =(int) (Math.random() * 99)-44;
            }
        }
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    public static void sumElement(int matrix[][]) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (count == 1 && matrix[i][j] < 0) {
                    sum += matrix[i][j];
                }
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
            System.out.println("Summary " + sum);
            sum = 0;
            count = 0;
        }
    }
}
