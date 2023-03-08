package homeworks;

import java.util.Scanner;

public class HM8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float sum = 0f;
        float avg = 0f;

        System.out.println("Enter the required size of the array: ");
        int arraySize = scanner.nextInt();

        float [] numbers = new float[arraySize];

        System.out.println("Enter the grades of the array one by one");

        for (int i = 0; i < arraySize; i++){
            System.out.println("Please enter element number:" + (i+1) );
            numbers [i] = scanner.nextFloat();
            sum += numbers [i];
            avg = sum/arraySize;

        }

        System.out.println("Average grade: " + avg);
        System.out.println("There was passed " + arraySize + " values");

    }
}
