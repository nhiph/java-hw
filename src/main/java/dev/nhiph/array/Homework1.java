package dev.nhiph.array;

import java.util.Scanner;

public class Homework1 {

    private static int[] generateIntArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array: ");
        String a = sc.nextLine();
        String[] ch=a.split("\\s+");
        int[] myIntArray = new int[ch.length];
        for (int i=0; i< ch.length; i++)
            myIntArray[i] = Integer.parseInt(ch[i]);
        return myIntArray;
    }

    private static  int[] generateIntArray2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element " + (i+1) + " : ");
            array[i] = sc.nextInt();
        }
        return array;
    }
    private static int calculateSum(int[] myIntArray) {
        int total = 0;
        for (int i = 0; i < myIntArray.length; i++)
            total += myIntArray[i];
        return total;
    }

    public static void main(String[] args) {
        int[] result = generateIntArray2();
        System.out.println(calculateSum(result));
    }
}
