package homeworks;

import java.util.Arrays;

public class HM13 {
    public static void main(String[] args) {

        int listOfNumbers[] = {234,5,45,23,65,33,1,64,2};
        System.out.println("Original array: " + Arrays.toString(listOfNumbers));

        System.out.println("Maximum value for the above array = " + max(listOfNumbers));
        System.out.println("Minimum value for the above array = " + min(listOfNumbers));

    }
    public static int max(int [] listOfNumbers){
        int max = listOfNumbers[0];
        for (int i = 0; i < listOfNumbers.length; i++) {
            if (listOfNumbers[i] > max){
                max = listOfNumbers[i];
            }
        }
        return max;

    }
    public static int min(int [] listOfNumbers) {
        int min = listOfNumbers[0];
        for (int i = 0; i < listOfNumbers.length; i++) {
            if (listOfNumbers[i] < min) {
                min = listOfNumbers[i];
            }
        }
        return min;
    }
}
