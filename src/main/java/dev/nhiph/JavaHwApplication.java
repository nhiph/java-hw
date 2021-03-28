package dev.nhiph;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaHwApplication {

    private static int[] generateIntArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static int findMinValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        return min;
    }

    private static int findMaxValue(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }

    private static int[] convertPosition(int[] array) {
        int length = array.length;
        int[] arrayNew = new int[length];
        for (int i = 0; i < length; i++) {
            if(i<length-1){
                arrayNew[i] = array[i+1];
            }
            else arrayNew[length-1] = array[0];
        }
        return arrayNew;
    }

    public static void main(String[] args) {
        int[] result = generateIntArray();
        System.out.println(result);
        System.out.println(findMinValue(result));
        System.out.println(findMaxValue(result));
        System.out.println(convertPosition(result));
    }

}
