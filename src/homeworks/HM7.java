package homeworks;

import java.util.Arrays;
import java.util.Scanner;


public class HM7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter the required size of the array:");
        int arraySize = scanner.nextInt();
        int element[]= new int[arraySize];


        System.out.println("Please enter the elements of the array on by one");


        for (int i = 0; i < arraySize; i++) {
            System.out.println("Please enter element number: " + (i+1));
            element[i] = scanner.nextInt();
            sum += element[i];

        }

        System.out.println("Source array:" + Arrays.toString(element));
       System.out.println("Sum of all array elements:" + sum);

    }
}

