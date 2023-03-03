package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HM7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the required size of the array:");
        int arraySize = scanner.nextInt();

        int[] elements = new int [arraySize];



        for (int i = 1; i<=arraySize; i++) {
            System.out.println("Please enter element number: " + i);
            int element = scanner.nextInt();

        }
        System.out.print("Source Array: " + " " );
    }
}
